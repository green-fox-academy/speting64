import Reservations.*;

public class ReservationApp {

    public static void main(String[] args){
        Reservation reservation = new Reservation();
        reservation.generateCode();
        reservation.getCodeBooking();
        reservation.getDowBooking();
        System.out.println(reservation.toString());
    }
}
