import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,

        Scanner scanner = new Scanner(System.in);
        int kiloMeter = scanner.nextInt();

        // then it converts that value to miles and prints it
        double mile = 1.609 * kiloMeter;

        System.out.println ("Kilometer:" + kiloMeter + " km");

        System.out.println ("Miles:" + mile + " miles");




    }


}
