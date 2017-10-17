package main.java.music;

public class Violin extends StringInstrument {

    public Violin(int number){
        setName("Violin");
        setNumberOfStrings(number);
        setSound("screech");
    }

    public Violin(){

        setName("Violin");
        setNumberOfStrings(4);
        setSound("screech");
    }

    public void play(){

        System.out.println(getName() + ", a " + getNumberOfStrings() + "-Stringed instrument that goes " + getSound() );

    }
}
