package Reservations;

public class Reservation implements Reservationy {

    String code;
    int randomDOW;

    public Reservation(){
        generateCode();
        getCodeBooking();
        getDowBooking();
    }

    public void generateCode(){

        code = new String();
        for (int i = 0; i < 8 ; i++) {
            code += String.valueOf(CHAR.charAt(((int)Math.random())* CHAR.length()));
        }
        randomDOW = (int)(Math.random())*DOW.length;
    }

    @Override
    public String getCodeBooking() {
        return code;
    }

    @Override
    public String getDowBooking() {
        return DOW[randomDOW];
    }

    @Override
    public String toString(){
        //return String.format("BOOKING# %s for %s " ,code, DOW[randomDOW]);
        return "BOOKING# " + getCodeBooking() + " for " + getDowBooking();
    }



}
