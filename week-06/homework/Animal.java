public abstract class Animal {

    String name;
    String gender;
    boolean endangered;


    public Animal(String name){

        this.name = name;
        gender = this.gender;
        this.endangered = endangered;
     }

    abstract String wantChild();
    abstract boolean isEndangered();
    abstract String greet();
    abstract void move();

    public String getName() {
        return name;
    }
}
