import java.util.Random;
public class HasElevation implements Elevation {
    int elevation;
    private static Random rand = new Random();
    @Override
    public int elevation() {
        // TODO Auto-generated method stub
        elevation = rand.nextInt(6501) - 500;
        return elevation;
        
    }
    
}
