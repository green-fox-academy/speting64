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

    Map <Type,Integer> vehicleTypes(List<Car> carList){
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

    Map <Color,Integer> vehicleColor(List<Car> carList){
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

    Map<String, Integer> carOccurence(List<Car> carList){
        Map<String,Integer> carMap = new HashMap<>();
        for(Car car :carList) {
            if (carMap.containsKey(car.toString())) {
                carMap.put(car.toString(), carMap.get(car.toString()) + 1);
            } else {
                carMap.put(car.toString(), 1);
            }
        }
        return carMap;
    }

    void mostFrequentCar (Map <String,Integer> mostMap){
        Map.Entry<String,Integer> maxEntry =null;

        for (Map.Entry<String, Integer> entry : mostMap.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        assert maxEntry != null;
        System.out.println(maxEntry);
    }

    public List<Car> getCarList(){
        return carList;
    }


}
