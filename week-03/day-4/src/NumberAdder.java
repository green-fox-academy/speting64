// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
import java.util.Scanner;

public class NumberAdder{
    static int addNumber(int n){
        int result = 0;
        for (int i = 0; i <= n ; i++) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(addNumber(7));
    }
}
