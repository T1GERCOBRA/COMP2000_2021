import java.awt.Color;


public class Water extends Cell {
  int max = 180;
  int min = 1;
  int range = max - min + 1;
  int rand;
  int rand1 = (int)(Math.random() * range) + min;
  int rand2 = (int)(Math.random() * range) + min;
  public Water(int x, int y) {
        super(x, y);
        rand = (int)(Math.random() * range) + min;
        elevation = rand;
        if(elevation>=0 && elevation<=50){
        color = new Color(0, 195, 255);
        }
        if(elevation>50 && elevation <=100){
          color = new Color(0, 152, 199);
        }
        if(elevation>100 && elevation<=180){
          color = new Color(3, 86, 163);

        }
        
        
    }
   
   
}
