<<<<<<< HEAD
import java.awt.*;

class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];
    // constructor
    public Grid(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
            }
        }
    }
    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
=======
import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;

class Grid {
    Cell[][] cells = new Cell[20][20];

    public Grid() {
        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(colToLabel(i), j, 10+35*i, 10+35*j);
            }
        }
    }

    private char colToLabel(int col) {
        return (char) (col + 65);
    }

    private int labelToCol(char col) {
        return (int) col - 65;
    }

    public void paint(Graphics g, Point mousePos) {
        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells[i].length; j++) { 
>>>>>>> 5b502f28322cb25ccc5e01d6c2d9500aefe5dae6
                cells[i][j].paint(g, mousePos);
            }
        }
    }

<<<<<<< HEAD
    public Cell cellAtColRow(int c, int r) {
        return cells[c][r];
    }
} 
=======
    private Optional<Cell> cellAtColRow(int c, int r) {
        if(c >= 0 && c < cells.length && r >= 0 && r < cells[c].length) {
            return Optional.of(cells[c][r]);
        } else {
            return Optional.empty();
        }
    }

    public Optional<Cell> cellAtColRow(char c, int r) {
        return cellAtColRow(labelToCol(c), r);
    }
    public Optional<Cell> cellAtPoint(Point p) {
        for(int i=0; i < cells.length; i++) {
            for(int j=0; j < cells[i].length; j++) {
                if(cells[i][j].contains(p)) {
                    return Optional.of(cells[i][j]);
                }
            }
        }
        return Optional.empty();
    }
}
>>>>>>> 5b502f28322cb25ccc5e01d6c2d9500aefe5dae6
