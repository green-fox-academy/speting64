import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code

// Also, print the sentence to the output with spaces in between.

public class QuoteSwap {

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println("Before Swapping:");
        for (String temp : list) {
            System.out.println(temp);
        }

        Collections.swap(list, 2, 5);
        System.out.println("ArrayList after swap:");
        for (String temp : list) {
            
            System.out.println(temp);
        }

        String space = "";
        for (int i = 0; i < list.size(); i++) {

            space += list.get(i) + " ";
        }

        System.out.printf(space);
    }
}

