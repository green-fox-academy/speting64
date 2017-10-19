package generics;

import java.util.Arrays;

public class SumArray {

    public static void main(String[] args) {

        Integer[] intArray = {5, 1, 4, 2, -11};
        Integer sumIntArray =(int) sumArray(intArray,intArray.length);
        System.out.println(sumIntArray);

    }

    public static <T extends Number> int sumArray( T[] summingArray , int length ){

        int sum = 0;
        try{
           if(sum >= 0){
               for (int i = 0; i < summingArray.length; i++) {
                   sum += summingArray[i].intValue();
               }
           }
        }catch(ArithmeticException e){
            System.out.println("Negative number");
            return -1;
        }
        return sum;
    }
}
