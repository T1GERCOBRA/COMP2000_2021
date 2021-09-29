//ID: 45911355  Name: Thien Tran

//elevation at sea level or lower
public class LowElevation implements Elevation {

    public int elevation;
    int minimumElevation = -500;
    int maxElevation = 2000;
  
    public int elevation(){
    
     elevation = (int)(Math.random()*(maxElevation-minimumElevation+1)+minimumElevation);
     //generates random int between -200 and 2000

     return elevation;

    }
}
