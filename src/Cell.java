import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.Optional;

class Cell extends Rectangle {
    static int size = 35;
    char col;
    int row;
    Color color;
    int elevation;
    String type;

    Mountain mountain;
    List <Cell> landscapes;
    
    public Cell(int x ,int y) {
        super(x, y, size, size);
    }

    void paint(Graphics g, Point mousePos) {
        g.setColor(color); 
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
        //System.out.println();
    }

    @Override
    public boolean contains(Point p) {
        if (p != null) {
            return(super.contains(p));
        } else {
            return false;
        }
    }
}
