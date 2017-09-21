// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

import java.util.Scanner;


public class Power{

    public static int pow(int x , int a){
        if (a == 1){
            return x;
        }
        else{
            return x*pow(x,a-1);
        }
    }
    public static void main(String[] args){
        int a;
        int m;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter int a ");
        a = in.nextInt();
        System.out.print("Enter int m ");
        m = in.nextInt();
        System.out.println(pow(a,m));
    }
}
