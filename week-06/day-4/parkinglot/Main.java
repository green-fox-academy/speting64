public class Main {

    public static void main(String[] args) {
        ParkingLot space = new ParkingLot();
        space.fillParkingLot();
        System.out.println(space.getCarList());
        System.out.println(space.VehicleTypes(space.getCarList()));
    }
}
