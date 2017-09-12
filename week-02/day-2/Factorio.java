//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;
public class Factorio {

    public static void main(String[] args){

        factorio();
    }
    public static void factorio(){

        int num;
        int count;
        int fact = 1;

        System.out.println("Enter an integer to calculate a factorial: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num < 0)
        {
            System.out.println("Negative Number: Try Again");
        }
        else
        {
            for (count = 1; count <= num; count++){

                fact = fact * count;
                System.out.println("Factorial of " + num + " is= " +fact );
            }
        }
    }
}
