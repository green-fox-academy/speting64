// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class ReverseElements {

    public static void main(String[] args){

        int[] aj= {3,4,5,6,7};
        for (int i =0; i < aj.length; i++){

            System.out.print(aj[4-i] + " ");
        }
    }
}
