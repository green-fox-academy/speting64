// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        System.out.println("Select an Operation");
        Scanner sc = new Scanner (System.in);
        String operation = sc.next();
        System.out.println("Type Number 1:");
        int num1 = sc.nextInt();
        System.out.println("Type Number 2:");
        int num2 = sc.nextInt();

        if (operation.equals("+")){
            System.out.println("The result of addition is:" + (num1+num2));
        }
        else if (operation.equals("-")){
            System.out.println("The result of subtraction is:" + (num1-num2));
        }
        else if (operation.equals("*")){
            System.out.println("The result of multiplication is:" + (num1*num2));
        }
        else if (operation.equals("/")){
            System.out.println("The result of division is:" + (num1/num2));
        }
        else if (operation.equals("%")){
            System.out.println("The remainder is:" + (num1%num2));
        }
        else{
            System.out.println("Invalid,try again");
        }
    }

}
