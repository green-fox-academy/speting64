//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

import java.util.Scanner;

public class Greet {

    public static void main(String[] args){

        greet();
    }
    public static void greet(){

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Greeting, Dear " + userName + "!");
    }

}
