import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private List<Car> carList = new ArrayList<>();

    void fillParkingLot(){
        for (int i = 0; i <16 ; i++) {
            Car car = new Car();
            carList.add(car);
        }
    }
/*
    Map <Type,Integer> VehicleTypes(List<Car> carList){
        return null;
    }*/

    public List<Car> getCarList(){
        return carList;
    }


}
