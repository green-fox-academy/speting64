import java.util.*;

public class MatchMaking {

    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        for (int i =0; i < 5 ; i++){
            order.add(girls.get(i));
            order.add(boys.get(i));
            
        }
        order.add(boys.get(5));

        System.out.println(order);


    }
}
