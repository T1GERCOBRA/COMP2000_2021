import java.awt.*;
public class Grid {
  public Grid(int h, int w){
   cells = new Cell[h][w];
   xCells = h;
   yCells = w;
   int x=0;
   int y=0;
   for(int i =0;i<h;i+=1){
       x=18;
       y=y+3;
    for(int j =0;j<w;j+=1){
       cells[i][j] = new Cell(x,y);
    }
   }
   }

   public void paint(Graphics p){
    for(int i =0;i<yCells;i+=1){
        for(int j =0;j<xCells;j+=1){
         cells[j][i].paint(p);
     }
    }
   
}
     int xCells, yCells;
     Cell [][] cells;

       }

