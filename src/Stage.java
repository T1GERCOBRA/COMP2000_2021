import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.awt.*;

public class Stage {
    Grid grid;
   
    Cell[][] cells = new Cell[20][20];


  int max = 400;
  int min = 1;
  int range = max - min + 1;
  int rand;
  

  
    
    public Stage() {
        // int mountainCounters = 100;
        // int roadCounters = 0;
        // int waterCounters = 0;
        // int grassCounters = 160;
        // int buildingCounters = 20;
        grid = new Grid();

       // car = new Car(grid.cellAtColRow(0, 15));
       
        //mountain = new Mountain(0, 0);
        for(int i = 0; i < 20; i++){
            
            for(int j = 0; j < 20; j++){
                
                rand = (int)(Math.random() * range) + min;
                
                
                if(rand>=1 && rand<=40){
                  
                    cells[i][j] = new Road(35*i, 35*j);
                    
                }
         
                if(rand>=41 && rand<=120){
                    cells[i][j] = new Water(35*i, 35*j);
                    
                }

                if(rand>=121 && rand<=280){
                    cells[i][j] = new Grass(35*i, 35*j);
                }

                if(rand>=281 && rand<=380){
                    cells[i][j] = new Mountain(35*i, 35*j);
                }

                if(rand>=381 && rand<=400){
                    cells[i][j] = new Building(35*i, 35*j);
                }
             
            
                    
                
            }
        }
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        //mountain.paint(g, mouseLoc);
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                cells[i][j].paint(g,mouseLoc);
               
            }
            }
            
            Optional<Cell> underMouse = cellAtPoint(mouseLoc);
            if(underMouse.isPresent()) {
             Cell hoverCell = underMouse.get();
            g.setColor(Color.DARK_GRAY);
            g.drawString(String.valueOf(hoverCell.elevation), 740, 30);
            g.drawString(hoverCell.type, 780, 30);
          
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