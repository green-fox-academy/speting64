public class Plant {

    String name;
    int water;
    int absorb;
    int filled;

    public Plant (){
        this.name = name;
        water = 100;
    }

    public boolean dry(){
        if(water < filled){
            return true;
        }
        return false;
    }
}
