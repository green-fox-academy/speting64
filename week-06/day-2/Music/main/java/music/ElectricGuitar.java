package main.java.music;

public class ElectricGuitar extends StringInstrument {

    public ElectricGuitar(int number){
        setName("Gibson");
        setNumberOfStrings(number);
        setSound("twang");
    }

    public ElectricGuitar(){

        setName("Gibson");
        setNumberOfStrings(6);
        setSound("twang");
    }

    public void play(){

        System.out.println(getName() + ", a " + getNumberOfStrings() + "-Stringed instrument that goes " + getSound() );

    }
}
