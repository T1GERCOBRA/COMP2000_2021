//ID: 45911355  Name: Thien Tran

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomCell implements CellFactory {
   private static Random rand = new Random();
   Elevation lowElev = new LowElevation();
   Elevation highElev = new HighElevation();
    @Override
    public Cell[][] randomCell(int sizeX, int sizeY) { 
      //sizeX and sizeY determine how many cells in the x and y direction
        
        Cell[][] cells = new Cell[sizeX][sizeY]; //make a 2D array with selected size
       
        List<Integer> distribution = new ArrayList<Integer>();
        distribution = IntStream.rangeClosed(0, 20 * 20 - 1).boxed().collect(Collectors.toList());
        int current;
        int index;
        for (int i = 0; i < cells.length; i++) {
          for (int j = 0; j < cells[i].length; j++) {
            
            // altitude vary over the following range:
            // -500 <= elevation <= 6000
            // this means that there are 6501 possible
            // values including zero
            
            
            // grab a random element from our list
            // use the element's value to determine
            // which cell type to instantiate
            // and then remove that element from the list
            // so that there are no repeats
            index = rand.nextInt(distribution.size());
            current = distribution.get(index);
            distribution.remove(index);
            char c = Grid.colToLabel(i);
            int x = 10 + 35 * i;
            int y = 10 + 35 * j;
            //  Road: 10% of 400 = 40
            if (current < 40) {
              cells[i][j] = new Road(c, j, x, y, highElev.elevation());
            }
            // Water: 20% of 400 = 80
            if (current >= 40 && current < 120) {
              cells[i][j] = new Water(c, j, x, y, lowElev.elevation());
            }
            // Grass: 40% of 400 = 160
            if (current >= 120 && current < 280) {
              cells[i][j] = new Grass(c, j, x, y, highElev.elevation());
            }
            // Mountain: 25% of 400 = 100
            if (current >= 280 && current < 380) {
              cells[i][j] = new Mountain(c, j, x, y, highElev.elevation());
            }
            // Buildings: 5% of 400 = 20
            if (current >= 380 && current < 400) {
              cells[i][j] = new Building(c, j, x, y);
            }
          }
        }
        return cells;
    }


     
}
