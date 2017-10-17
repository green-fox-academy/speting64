public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        gender = "female";
        endangered = false;
    }

    @Override
    String wantChild() {
        return "want a child from an egg!";
    }

    @Override
    String greet() {
        return "I am a bird";
    }

    public void move(){
        System.out.println("is flying");
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
