// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {

    static int count =1;
    static void coun(){
        if(count <= 10){
            System.out.println("Count to "+ count);
            count++;
            coun();
        }
    }
    public static void main(String[] args){
        coun();
    }
}
