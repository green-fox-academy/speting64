//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter

public class Sum {

    public static void main(String[] args){

        sum();
    }

    public static int sum(){

        int[] numbers = {5,6,7,8,9};
        int result = 0;
        for (int i = 0; i < numbers.length; i++){
            result += numbers[i];
            System.out.println(result);
        }
        return result;
    }

}
