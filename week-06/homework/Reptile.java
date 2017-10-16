public class Reptile extends Animal {

    public Reptile(String name){

        super(name);
        gender = "female";
        endangered =  false;
    }

    @Override
    String wantChild() {
        return "want a child from an egg!";
    }

    @Override
    String greet() {
        return "I am a reptile";
    }

    public void move(){
        System.out.println("is swimming");
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
