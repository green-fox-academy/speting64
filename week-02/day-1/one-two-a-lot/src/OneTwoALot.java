import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args)
    {
        // Write a program that reads a number form the standard input,

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        // If the number is zero or smaller it should print: Not enough
        if (number <= 0)
        {
            System.out.println("Not Enough");
        }
        else if(number == 1)
        {
            System.out.println("One") ; // If the number is one it should print: One
        }
        else if(number == 2)
        {
            System.out.println("Two"); // If the number is two it should print: Two
        }
        else
        {
            System.out.println("A lot"); /// If the number is more than two it should print: A lot
        }

    }

}
