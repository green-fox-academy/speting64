public class Main {

    public static void main(String[] args) {
        ParkingLot space = new ParkingLot();
        space.fillParkingLot();
        System.out.println(space.vehicleTypes(space.getCarList()));
        System.out.println(space.vehicleColor(space.getCarList()));
        System.out.println(space.carOccurence(space.getCarList()));
        space.mostFrequentCar(space.carOccurence(space.getCarList()));
    }
}
