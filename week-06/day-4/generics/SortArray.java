package generics;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        Integer[] intArray = {5, 1, 4, 2, 3};
        Integer[] sortedIntArray = sortArray(intArray,intArray.length);
        System.out.println(Arrays.toString(sortedIntArray));

    }
    public static <T extends Number> T[] sortArray( T[] sortingArray , int length ) {

        Arrays.sort(sortingArray);
        for (int i = 0; i <sortingArray.length/2; i++) {
            T newArray = sortingArray[i];
            sortingArray[i] = sortingArray[sortingArray.length-1-i];
            sortingArray[sortingArray.length-1-i]= newArray;
        }
        return sortingArray;

    }
}
