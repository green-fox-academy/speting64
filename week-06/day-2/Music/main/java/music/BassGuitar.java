package main.java.music;

public class BassGuitar extends StringInstrument {

    public BassGuitar(int number){
        setName("Bass");
        setNumberOfStrings(number);
        setSound("wah-wah");
    }

    public BassGuitar(){

        setName("Bass");
        setNumberOfStrings(4);
        setSound("wah-wah");
    }

    public void play(){
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-Stringed instrument that goes" + getSound() );

    }
}
