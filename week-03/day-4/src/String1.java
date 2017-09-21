// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
    public static String replace(String s , char x, char y){
        if(s.length()<1){
            return s;
        }
        else{
            char first = x == s.charAt(0) ? y : s.charAt(0);
            return first + replace(s.substring(1),x,y);
        }
    }
    public static void main(String[] args){
        String words = "xexixy";
        char x = 'x';
        char y = 'y';
        System.out.println(replace(words, x, y));
    }
}
