//Thien Tran   ID: 45911355

import java.awt.Color;
public class Road extends Cell {
  int max = 6000;
  int min = 1;
  int range = max - min + 1;//defines min and max range
  int rand;//gets random integer between range. This random int determines the shade of color
  
 
  public Road(int x, int y) {
    super(x, y);
    type = "Road";
    rand = (int)(Math.random() * range) + min;
    elevation = rand;
    
    if(elevation>=0 && elevation<=1500){
    color = new Color(69, 68, 68);
    }

    if(elevation>1500 && elevation <=3000){
    color = new Color(89, 89, 87);
    }

    if(elevation>3000 && elevation<=4500){
    color = new Color(128, 128, 128);
    }

    if(elevation>4500 && elevation<=6000){
    color = new Color(168, 168, 168);
  }
        
        
        
    }
   
   
}
