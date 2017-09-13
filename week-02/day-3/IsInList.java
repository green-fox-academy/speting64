import java.util.*;
import java.util.ArrayList;

// Check if list contains all of the following elements: 4,8,12,16
// Print "true" if it contains all, otherwise print "false"
// Can you do both the different approaches you tried in the previous one?

public class IsInList {

    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        //Solution 1

        if(((list.contains(2))&&(list.contains(4))&&(list.contains(6))&&(list.contains(8)))){

            System.out.println("true");
        }
        else{

            System.out.println("false");
        }

        //Solution 2

        int[]  elements = {4,8,12,16};
        boolean included = true;

        {
            for (int i =0; i< elements.length; i++){

                if (!list.contains(elements[i])){

                    included = false;
                }
            }
            System.out.println(included);
        }
    }
}

