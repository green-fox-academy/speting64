import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args){

            int sum=0,rem,temp;
            System.out.println("Please enter a number:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            temp=n;
            while(n>0){

                rem=n%10;
                n=n/10;
                sum=sum+(rem*rem*rem);
            }
            if(temp==sum){
                System.out.println(sum + " is an armstrong number");
            }
            else{
                System.out.println(sum + " is not an armstrong number");
            }
        }
    }
