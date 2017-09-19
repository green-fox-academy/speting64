import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import  java.util.List;
import  java.util.ArrayList;
import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        Divide();
    }
    public static void Divide(){
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
            try{
                int result = 10/divisor;
                System.out.println("Result:" + result);
            }catch (ArithmeticException e){System.out.println("Fail: Cant divide by zero ");}
        }
    }

