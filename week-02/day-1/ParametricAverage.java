// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args){

        System.out.println("Please enter the number of elements: ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        int sum =0;

        for (int i =0 ; i <= num ; i ++){

            System.out.println("Number: ");
            sum += sc.nextInt();
        }
        float average = sum/num;
        System.out.println("Average: " + average);


    }
}
