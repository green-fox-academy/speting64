import java.util.Scanner;

public class AnimalsAndLegs {

           public static void main(String[] args) {
            // Write a program that asks for two integers

            //int chickenLeg= 2;
            //int pigLeg = 4;

            Scanner scanner = new Scanner (System.in);
            // The first represents the number of chickens the farmer has
            // The seconf represents the number of pigs the farmer has

            System.out.println("Chickens:");
            int chickenSum = scanner.nextInt();
            System.out.println("Chickens:" + chickenSum);

            System.out.println("Pigs:" );
            int pigSum = scanner.nextInt();
            System.out.println("Pigs:" + pigSum);

            int chickenLeg= 2 * chickenSum;
            int pigLeg = 4 * pigSum;

            // It should print how many legs all the animals have

            System.out.println("Legs of Chicken:" + chickenLeg + " legs");
            System.out.println("Legs of Pigs:" + pigLeg + " legs");

        }
    }

