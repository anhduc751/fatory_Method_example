
public class BikeFactory {
    public Bike createBike(bikeType type){
        if (type.equals(bikeType.Type1)){
            return new BikeOneWheel();
        }
        else return new BikeTwoWheel();
    }
}
