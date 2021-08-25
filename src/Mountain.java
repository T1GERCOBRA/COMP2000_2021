import java.awt.*;
import java.awt.Color;


public class Mountain extends Cell {
  int max = 180;
  int min = 1;
  int range = max - min + 1;
  int rand;
  int rand1 = (int)(Math.random() * range) + min;
  int rand2 = (int)(Math.random() * range) + min;
  public Mountain(int x, int y) {
        super(x, y);
        rand = (int)(Math.random() * range) + min;
        elevation = rand;
        if(elevation>=0 && elevation<=50){
        color = new Color(255,255,0);
        }
        if(elevation>50 && elevation <=100){
          color = new Color(255,255,100);
        }
        if(elevation>100 && elevation<=180){
          color = new Color(255,255,180);

        }

        type = "Mountain";
        
        
    }

   
   
}
