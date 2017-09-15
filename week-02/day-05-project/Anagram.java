import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagramSearcher("god", "dog"));
        System.out.println(anagramSearcher("green", "fox"));
    }

    public static boolean anagramSearcher(String pos, String neg) {

        if(pos.length() != neg.length()){

            return false;
        }
        int[] counts = new int[26];
        int difference = 0;

        for (int i =0 ; i < pos.length() ; i++){

            int positive = (int) pos.charAt(i)-97;
            if(counts[positive] <= 0){
                difference++;
            }
            else{
                difference--;
            }
            counts[positive]++;

            int negative = (int) neg.charAt(i)-97;
            if(counts[negative] <= 0){
                difference++;
            }
            else{

                difference--;
            }
            counts[negative]++;
        }

        return difference == 0;
    }
}