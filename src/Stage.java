import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.awt.*;

public class Stage {
    Grid grid;
    Actor train;
    Actor car;
    Actor boat;
    Mountain mountain;
    Road road;
    Grass grass;
    Water water;
    Building building;
    Cell[][] mountains = new Cell[20][20];
    List<String> landscapes = new ArrayList<String>();

   


    
    public Stage() {
        // int mountainCounters = 100;
        // int roadCounters = 0;
        // int waterCounters = 0;
        // int grassCounters = 160;
        // int buildingCounters = 20;
        grid = new Grid();
        landscapes.add("building");
        landscapes.add("road");
        landscapes.add("grass");
        landscapes.add("mountain");
        landscapes.add("water");
        
       // car = new Car(grid.cellAtColRow(0, 15));
        
        //mountain = new Mountain(0, 0);
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                String s = getRandomElement(landscapes);
                
                
                if(s.equals("road")){
                  
                    mountains[i][j] = new Road(35*i, 35*j);
                    
                    
                
                }
         
                if(s.equals("mountain")){
                    mountains[i][j] = new Mountain(35*i, 35*j);
                    System.out.println(mountains[i][j] .elevation);
                }

                if(s.equals("water")){
                    mountains[i][j] = new Water(35*i, 35*j);
                }

                if(s.equals("grass")){
                    mountains[i][j] = new Grass(35*i, 35*j);
                }

                if(s.equals("building")){
                    mountains[i][j] = new Building(35*i, 35*j);
                }
             
                // mountains[1][1] = new Building(35, 35);
                // mountains[2][1] = new Water(70, 35);
                //  mountains[1][2] = new Grass(35, 35*2);
                //  mountains[3][3] = new Mountain(35*3, 35*3);
                // ;
               // roadCounters=-1;
                    
                
            }}
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        //mountain.paint(g, mouseLoc);
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                mountains[i][j].paint(g,mouseLoc);
            }}
        
    }

    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
