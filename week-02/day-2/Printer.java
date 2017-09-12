//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

import java.util.Scanner;

public class Printer {

    public static void main(String[] args){

        String[] parameter = {"first", "second", "third", "fourth"};
        printer(parameter);
    }
    public static void printer(String print[]){

        for (int i =0 ; i < print.length; i++){

            System.out.println(print[i]);
        }
    }
}
