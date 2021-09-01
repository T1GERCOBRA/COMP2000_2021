//Thien Tran   ID: 45911355

import java.awt.Color;
public class Water extends Cell {
  int max = -500;
  int min = 0;
  int range = max - min + 1;//defines min and max range
  int rand;//gets random integer between range. This random int determines the shade of color

  public Water(int x, int y) {
    super(x, y);
    rand = (int)(Math.random() * range) + min;//get random int
    elevation = rand;
    if(elevation<=0 && elevation>=-125){
      color = new Color(0, 177, 222);
    }
  
    if(elevation<-125 && elevation >=-250){
      color = new Color(0, 141, 222);
    }
  
    if(elevation<-250 && elevation>=-375){
      color = new Color(0, 100, 222);
  
    }
  
   if(elevation<-375 && elevation>=-500){
       color = new Color(0, 26, 222);
   }
  }   
}
