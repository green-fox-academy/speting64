public class String2 {

    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.


    public static String replaceLetter(String s){
        String secLet = "";
        if(s.length() < 1){
            return s;
        }
        if (s.charAt(0) == 'x'){
            secLet = " " + replaceLetter(s.substring(1));
        }
        else{
            secLet = s.charAt(0) + replaceLetter(s.substring(1));
        }
        return secLet;
    }
    public static void main(String[] args){
            String words = "vxxxie";
            System.out.println(replaceLetter(words));
    }
  }


