public class Car {

    int gasAmount;
    int capacity;

    public Car(){

        this.gasAmount = 0;
        this.capacity = 100;
    }

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.capacity);

    }
}
