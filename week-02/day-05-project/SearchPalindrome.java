import java.util.Scanner;

public class SearchPalindrome {

    public static boolean checkPalindrome(String s){

        boolean palin = false;
        int count =0;
        for (int i = 0; i <= s.length()/2 ; i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){

                count++;
            }
            palin=true;
        }
        return palin;
    }

    public static void printPalindromes(String s) {

        for (int i =0 ; i <= s.length() ; i++){
            for(int j = i+1 ; j < s.length() ; j++){
                if(checkPalindrome(s.substring(1, j+1))){
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }

    public static void main(String[] args) {

        printPalindromes("racecar");
    }

}

