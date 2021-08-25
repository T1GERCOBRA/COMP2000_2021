import java.awt.*;

public abstract class Actor {
    Color color;
    Cell loc;

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(loc.x , loc.y, loc.width , loc.height);
        g.setColor(Color.GRAY);
        g.drawRect(loc.x, loc.y, loc.width , loc.height );
    }
}