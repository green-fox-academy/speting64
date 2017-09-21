import java.util.Scanner;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {

    static int earBunny(int ear , int  bun){
        if (ear == 0 || bun == 0){
            return 0;
        }
        else if (bun > 0){
            return ear + earBunny(ear,bun-1);
        }
        else if (bun < 0){
            return -earBunny(ear,-bun);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bunnies ");
        int bunny = sc.nextInt();
        int ear = 2;
        System.out.println(earBunny(bunny,ear));
    }
}
