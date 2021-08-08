import javax.swing.JPanel;
import java.awt.*;

public class Cell extends JPanel {
    public Cell(int x, int y){
        x=a;
        y=b;
        
    }
    public void paintComponent(Graphics g){
        
             g.setColor(Color.WHITE);
             g.fillRect(a,b,35,35);
             g.setColor(Color.BLACK);
             g.drawRect(a,b,35,35);
   

    }
    int a,b;
}
