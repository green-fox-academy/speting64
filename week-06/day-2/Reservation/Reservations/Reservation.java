package Reservations;

public class Reservation implements Reservationy {

    String code;
    private String[] DOW;
    //int randomDOW;
    private String dow;


    public Reservation(){
        generateCode();
         DOW = new String[] {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
         generateDOW();
    }

    public void generateCode(){

        code = "";
        for (int i = 0; i < 8 ; i++) {
            int num = (int)(65+Math.random()*25);
            char digit = (char) num;
            code +=digit;
        }
    }

    public void generateDOW(){
        dow = DOW[(int)(Math.random()*7)];
    }

    @Override
    public String getCodeBooking() {
        return code;
    }

    @Override
    public String getDowBooking() {
        return dow;
    }

    @Override
    public String toString(){
        return String.format("BOOKING# %s for %s " ,code, dow);
        //return "BOOKING# " + getCodeBooking() + " for " + getDowBooking();
    }



}
