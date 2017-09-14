// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessingGame{

        public static void main (String[] args){

            int number = 8;
            int maxnum =100;

            System.out.println("Hello and welcome to my number guessing game.");
            Scanner input = new Scanner (System.in);
            int guess;
            boolean win =false;

            while(win == false){

                System.out.println("Guess a number between 1 and "+ maxnum +": ");
                guess = input.nextInt();

                if(guess == number){

                    win = true;
                    System.out.println("You found the number " + number + "!");
                    System.out.println("You win!");
                }
                else if (guess < number){

                    System.out.println("Stored Number is too low");
                }
                else if (guess > number){

                    System.out.println(" Stored Number is too high");
                }

            }
    }
}
