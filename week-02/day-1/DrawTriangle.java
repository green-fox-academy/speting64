import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args){

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        int row  = scanner.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
