public class BuildPalindrome {

    static void isPalindrome(String input) {

        String[] word = input.split(" ");
        String reverse = " ";
        for (int i = 0; i < word.length; i++) {

            String words = word[i];
            String reverseWord = " ";
            for (int j = words.length()-1 ; j >=0 ; j--){

                reverseWord +=  words.charAt(j);
            }
            reverse = reverse + reverseWord + " ";
        }
        System.out.println(input);
        System.out.println(reverse);
        System.out.println("-------------------------");
    }



    public static void main(String[] args) {

        isPalindrome("greenfox");
        isPalindrome("dog");
    }

}
