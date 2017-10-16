public class Mammal extends Animal {

    public Mammal(String name){

        super(name);
        gender = "male";
        endangered =  true;
    }

    @Override
    String wantChild() {
        return "want a child from my uterus!";
    }

    @Override
    String greet() {
        return "I am a mammal";
    }

    public void move(){
        System.out.println("is running");
    }

    boolean isEndangered() {
        if(endangered==true){
            System.out.println("The " + name + " is endangered");
        }
        else{
            System.out.println("The " + name + " is not endangered");
        }
        return endangered;
    }
}
