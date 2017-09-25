public class Station {
    int gasAmount =300;
    int capacity = 300;

    public void refill(){

        Car myCar = new Car();
        this.capacity -= myCar.capacity;
        myCar.gasAmount += myCar.capacity;
    }

    public static void main(String[] args) {

        Station station = new Station();
        station.refill();
        System.out.println("Before Injection: " + station.gasAmount );
        System.out.println("After Injection: " + station.capacity );
    }
}
