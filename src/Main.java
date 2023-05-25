public class Main {
    public static void main(String[] args) {
        BikeFactory bikeFactory = new BikeFactory();
        Bike bike1 =  bikeFactory.createBike(bikeType.Type1);
        bike1.run();
//        Bike bike2 = new BikeTwoWheel();
        //bike.createBike(bikeType.Type2).run();

    }
}