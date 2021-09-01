//Thien Tran   ID: 45911355

import java.awt.Color;
public class Mountain extends Cell {
  int max = 6000;
  int min = 1;
  int range = max - min + 1;//defines min and max range
  int rand;//gets random integer between range. This random int determines the shade of color

  public Mountain(int x, int y) {
    super(x, y);
    rand = (int)(Math.random() * range) + min;//get random int
    elevation = rand;//elevation determined by random int
    type = "Mountain";

    if(elevation>=0 && elevation<=1500){//all ranges from 0-6000
      color = new Color(235, 235, 0);
    }

    if(elevation>1500 && elevation <=3000){
      color = new Color(255,255,0);
    }

    if(elevation>3000 && elevation<=4500){
      color = new Color(255,255,100);
    }

    if(elevation>4500 && elevation<=6000){
       color = new Color(255,255,180);
    }
  }   
}
