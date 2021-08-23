import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Stage {
    List<Actor> actors;
    Grid grid;
    Actor train;
    Actor car;
    Actor boat;
    
    public Stage() {
        actors= new ArrayList<Actor>();
        grid = new Grid();
        train = new Train(grid.cellAtColRow(0, 0));
        car = new Car(grid.cellAtColRow(0, 15));
        boat = new Boat(grid.cellAtColRow(12, 9));
        
        actors.add(train);
        actors.add(car);
        actors.add(boat);
        System.out.println(actors.size());
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        for(int i =0;i<actors.size();i++){
            actors.get(i).paint(g);
        }
        // train.paint(g);
        // car.paint(g);
        // boat.paint(g);
    }
}