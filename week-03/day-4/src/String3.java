// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
    public static String adjaChar(String s){
        String adjacent = " ";
        if(s.length() < 1){
            return adjacent;
        }
        else{
            adjacent = s.charAt(0) + "*" + adjaChar(s.substring(1));
            return adjacent;
        }
    }
    public static void main(String[] args){
        String words = "iamnotgonnamakeit";
        System.out.println(adjaChar(words));
    }
}
