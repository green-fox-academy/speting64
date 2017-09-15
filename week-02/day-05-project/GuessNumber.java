import java.util.Scanner;

public class GuessNumber{

    public static void main (String[] args){

        int number = 15;
        int maxnum =100;

        System.out.println("Hello and welcome to my number guessing game.");
        Scanner input = new Scanner (System.in);
        int guess;
        int tries =4;
        boolean win =false;
        while(win == false){

            System.out.println("Guess a number between 1 and "+ maxnum +". You have "+ tries + " lives ");
            guess = input.nextInt();
            tries--;
            if(tries == 0){
                System.out.println("You lost");
                break;
            }
            if(guess == number){
                win = true;
                System.out.println("Congratulations you found number " + number + "!");
            }
            else if (guess < number){
                System.out.println("Too low. You have " + tries + " lives left.");
            }
            else if (guess > number){
                System.out.println("Too high. You have " + tries + " lives left.");
            }
        }
    }
}
