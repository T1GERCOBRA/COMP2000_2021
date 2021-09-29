//ID: 45911355  Name: Thien Tran

//elevation at sea level or higher
public class HighElevation implements Elevation {
    public int elevation;
    int minimumElevation = 0;
    int maxElevation = 6000;
  
    public int elevation(){
    
     elevation = (int)(Math.random()*(maxElevation-minimumElevation+1)+minimumElevation);  
     return elevation;

    }
}
