//Thien Tran   ID: 45911355

import java.awt.Graphics;
import java.util.Optional;
import java.awt.*;
public class Stage {
Grid grid;
   
Cell[][] cells = new Cell[20][20]; //instantiate 2d array of cell objects

int max = 400;
int min = 1;
int range = max - min + 1; //defines range for choosing probability of type of cell.
//the ranges defined relate to the probability of choosing a type of cell. The bigger the range, the more likely 
//the type of cell will be chosen
int rand;

public Stage() {
    
  grid = new Grid();
        
  for(int i = 0; i < 20; i++){
    for(int j = 0; j < 20; j++){
       rand = (int)(Math.random() * range) + min;//get random int

       if(rand>=1 && rand<=40){//if in range, make a road cell
       cells[i][j] = new Road(35*i, 35*j);
       }

       if(rand>=41 && rand<=120){//if in range, make a water cell
       cells[i][j] = new Water(35*i, 35*j);
       }

       if(rand>=121 && rand<=280){//if in range, make a grass cell
       cells[i][j] = new Grass(35*i, 35*j);
       }

       if(rand>=281 && rand<=380){//if in range, make a mountain cell
       cells[i][j] = new Mountain(35*i, 35*j);
       }

       if(rand>=381 && rand<=400){//if in range, make a building cell
       cells[i][j] = new Building(35*i, 35*j);
       }
            
    }
  }
}

public void paint(Graphics g, Point mouseLoc) {
  grid.paint(g, mouseLoc);
       
  for(int i = 0; i < 20; i++){
    for(int j = 0; j < 20; j++){
      cells[i][j].paint(g,mouseLoc);//paint the cells
      }
    }

    Optional<Cell> underMouse = cellAtPoint(mouseLoc);

    if(underMouse.isPresent()) {//if mouse is on cell, get and reveal its info
    Cell hoverCell = underMouse.get();

    g.drawString("Elevation:", 740, 30);
    g.drawString(String.valueOf(hoverCell.elevation), 820, 30);
    g.drawString("Type:", 740, 60);
    g.drawString(hoverCell.type, 820, 60);
          
    }
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