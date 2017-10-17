package Reservations;

public interface Reservationy {

    String[] DOW = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
    String CHAR = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String getDowBooking();
    String getCodeBooking();
    String toString();
}
