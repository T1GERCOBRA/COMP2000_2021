import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        //System.out.println("Red vs. Blue");
        Main window = new Main();
        
        
        
    }
    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        grid = new Grid(20,20);
        this.pack();
        this.setVisible(true);
        
    }
    
    public class Canvas extends JPanel{
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
       
        public void paint(Graphics p){
          grid.paint(p);
    }
   
}

Grid grid;

    
}
