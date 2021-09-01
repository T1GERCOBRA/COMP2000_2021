//Thien Tran   ID: 45911355

import java.awt.Graphics;
import java.awt.Point;

class Grid {
    //fields
  Cell[][] cells = new Cell[20][20];
    
    // constructor
  public Grid(){
    for(int i = 0; i < cells.length; i++){
      for(int j = 0; j < cells[i].length; j++){
        cells[i][j] = new Cell(35*i,35*j);
        }
    }
}

    // methods
public void paint(Graphics g, Point mousePos){
  for(int i = 0; i < cells.length; i++){
    for(int j = 0; j < cells[i].length; j++){
      cells[i][j].paint(g, mousePos);
    }
  }
}

public Cell cellAtColRow(int c, int r) {
    return cells[c][r];
}

} 