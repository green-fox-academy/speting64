import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private List<Car> carList = new ArrayList<>();

    void fillParkingLot(){
        for (int i = 0; i <256 ; i++) {
            Car car = new Car();
            carList.add(car);
        }
    }

    Map <Type,Integer> VehicleTypes(List<Car> carList){
        Map<Type,Integer> typeMap = new HashMap<>();
        for(Car car :carList){
            if(typeMap.containsKey(car.getType())){
                typeMap.put(car.getType(),typeMap.get(car.getType())+1);
            }else{
                typeMap.put(car.getType(),1);
            }
        }
        return typeMap;
    }

    Map <Color,Integer> VehicleColor(List<Car> carList){
        Map<Color,Integer> colorMap = new HashMap<>();
        for(Car car :carList){
            if(colorMap.containsKey(car.getColor())){
                colorMap.put(car.getColor(),colorMap.get(car.getColor())+1);
            }else{
                colorMap.put(car.getColor(),1);
            }
        }
        return colorMap;
    }

    public List<Car> getCarList(){
        return carList;
    }


}
