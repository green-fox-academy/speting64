// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args){

        System.out.println("Enter the number of lines :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
