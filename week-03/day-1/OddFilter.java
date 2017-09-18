import java.util.*;

// Create a function that takes a list as a parameter,
// and returns a new list with every odd element from the original list

public class OddFilter {

    public void main(String[] args){
       ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
       System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
    }

    public int oddFilter (int[] values) {

        int countOdd =0;
        for (int i=0; i<values.length; i++) {
                countOdd += values[i]%2;
            }
            return countOdd;
    }
}
