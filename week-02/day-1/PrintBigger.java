// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args){

        int x,y;
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x>y){

            System.out.println("Number x is greater");
        }
        else if (x<y){

            System.out.println("Number y is greater");
        }
        else{

            System.out.println("Equal Numbers");
        }
    }
}
