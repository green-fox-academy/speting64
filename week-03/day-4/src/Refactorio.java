import java.util.Scanner;

// - Create a recursive function called `refactorio`
//   that returns it's input's factorial

public class Refactorio {

    static int refactorio(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n *= refactorio(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println("Factorial of "+ refactorio(5));
    }


}
