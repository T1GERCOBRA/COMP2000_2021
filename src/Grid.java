//ID: 45911355  Name: Thien Tran

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;


class Grid {
  
  Cell[][] cellArray; //contains the results of RandomCell
  CellFactory cells = new RandomCell(); //instance that calls for RandomCell

  public Grid() {
   
    cellArray = cells.randomCell(20, 20); //now cellArray contains 20x20 random Cells

  }

  public static char colToLabel(int col) {
    return (char) (col + 65);
  }

  private int labelToCol(char col) {
    return (int) col - 65;
  }

  public void paint(Graphics g, Point mousePos) {
    doToEachCell((Cell c) -> c.paint(g, mousePos));
  }

  private Optional<Cell> cellAtColRow(int c, int r) {
    if (c >= 0 && c < cellArray.length && r >= 0 && r < cellArray[c].length) {
      return Optional.of(cellArray[c][r]);
    } else {
      return Optional.empty();
    }
  }

  public Optional<Cell> cellAtColRow(char c, int r) {
    return cellAtColRow(labelToCol(c), r);
  }

  public Optional<Cell> cellAtPoint(Point p) {
    for (int i = 0; i < cellArray.length; i++) {
      for (int j = 0; j < cellArray[i].length; j++) {
        if (cellArray[i][j].contains(p)) {
          return Optional.of(cellArray[i][j]);
        }
      }
    }
    return Optional.empty();
  }

  public List<Cell> cellsInRange(char c1, int r1, char c2, int r2) {
    int c1i = labelToCol(c1);
    int c2i = labelToCol(c2);
    List<Cell> output = new ArrayList<Cell>();
    for (int i = c1i; i <= c2i; i++) {
      for (int j = r1; j <= r2; j++) {
        cellAtColRow(colToLabel(i), j).ifPresent(output::add);
      }
    }
    return output;
  }

  public void replaceCell(Cell old, Cell replacement) {
    cellArray[labelToCol(old.col)][old.row] = replacement;
  }

  /**
   * Takes a cell consumer (i.e. a function that has a single `Cell` argument and
   * returns `void`) and applies that consumer to each cell in the grid.
   *
   * @param func The `Cell` to `void` function to apply at each spot.
   */
  public void doToEachCell(Consumer<Cell> func) {
    for (int i = 0; i < cellArray.length; i++) {
      for (int j = 0; j < cellArray[i].length; j++) {
        func.accept(cellArray[i][j]);
      }
    }
  }

  public void paintOverlay(Graphics g, List<Cell> cells, Color color) {
    g.setColor(color);
    for (Cell c : cells) {
      g.fillRect(c.x + 2, c.y + 2, c.width - 4, c.height - 4);
    }
  }

  public List<Cell> getRadius(Cell from, int size, boolean considerElevation) {
    int i = labelToCol(from.col);
    int j = from.row;
    Set<Cell> inRadius = new HashSet<Cell>();
    if (size > 0) {
      cellAtColRow(colToLabel(i), j - 1).ifPresent(inRadius::add);
      cellAtColRow(colToLabel(i), j + 1).ifPresent(inRadius::add);
      cellAtColRow(colToLabel(i - 1), j).ifPresent(inRadius::add);
      cellAtColRow(colToLabel(i + 1), j).ifPresent(inRadius::add);
    }

    for (Cell c : inRadius.toArray(new Cell[0])) {
      if (considerElevation) {
        if (c instanceof Landscape) {
          Landscape here = (Landscape) from;
          Landscape there = (Landscape) c;
          if (here.elevation() > there.elevation()) {
            inRadius.addAll(getRadius(c, size, true));
          } else {
            inRadius.addAll(getRadius(c, size - 1, true));
          }
        } else {
          inRadius.remove(c);
        }
      } else {
        inRadius.addAll(getRadius(c, size - 1, false));
      }
    }
    return new ArrayList<Cell>(inRadius);
  }

  public String toString() {
    String retval = new String();
    for (int i = 0; i < cellArray.length; i++) {
      for (int j = 0; j < cellArray[i].length; j++) {
        retval = retval + cellArray[i][j];
      }
    }
    return retval;
  }
}