import java.awt.*;
public class Train extends Actor{
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Train(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
            }
        }
    }
  
    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paint(g, mousePos);
                g.setColor(Color.red);
            }
        }
    }
}
