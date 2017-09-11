import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        System.out.println("Enter first Number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second Number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third Number:");
        int thirdNumber = scanner.nextInt();

        System.out.println("Enter foutrh Number:");
        int fourthNumber = scanner.nextInt();

        System.out.println("Enter fifth Number:");
        int fifthNumber = scanner.nextInt();


        int sum = firstNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber;
        double average = sum/5.0;

        System.out.println("Sum:" + sum);
        System.out.println("Average:" + average);







    }

}
