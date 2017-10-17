package main.java.music;

public abstract class StringInstrument extends Instrument {

    int numberOfStrings;
    String sound;

    public StringInstrument(){

    }

    public void setNumberOfStrings(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String getSound(){
        return sound;
    }
    public abstract void play();
}
