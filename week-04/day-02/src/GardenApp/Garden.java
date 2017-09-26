
import java.util.ArrayList;
import java.util.List;

public class Garden{

    List<Plant> plants;

    public Garden(int waterStored){

    }
    public Garden(){
        plants = new ArrayList<Plant>();
    }

    public void giveWater(int waterStored){
        System.out.println("Watering with" + waterStored);
        for(Plant plant: plants){
            if(plant.dry()){
                plant.water += waterStored / plants.size() * plant.absorb/100;
            }
        }
        myPlants();
    }
    public void newPlant(Plant plant){

        plants.add(plant);
    }

    public void myPlants(){
        for(Plant plant: plants){
            if(plant.dry()){
                System.out.println("The "+ plant + " needs water");
            }
            else{
                System.out.println("The"+ plant + " doesnt need water");
            }
        }
        System.out.println("");
    }
}
