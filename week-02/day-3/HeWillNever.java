import java.util.*;
import java.util.Map;
import java.util.Map.Entry;


// Things are a little bit messed up
// Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
// Assemble the fragments into the out variable

public class HeWillNever {

    public static void main(String... args){
       String out = "";
        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};


        HashMap<Integer, String> hmap = new HashMap<Integer, String>();



        System.out.println(hmap);

        hmap.put(7, "run around and desert you");
        hmap.put(50, "tell a lie and hurt you");
        hmap.put(49, "make you cry,");
        hmap.put(2, "let you down");
        hmap.put(12, "give you up,");
        hmap.put(1, "Never gonna");
        hmap.put(11, "\n");
        hmap.put(3, "say goodbye");

        for(int i =0; i < notSoCrypticMessage.length; i++){

            out = hmap.get(notSoCrypticMessage[i]);
            System.out.println(out);
        }


        /*


        List<Entry<Integer, String>> list = new LinkedList<Entry<Integer,String>>(hmap.entrySet());
        Collections.sort(list , new Comparator<Entry<Integer,String>>(){

            public int compare(Entry<Integer , String> o1 , Entry <Integer, String> o2){

                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Entry<Integer, String> item :list){

            System.out.println(item);
        }
 */
/*
        for(Map.Entry <Integer, String> m: hmap.entrySet())
        {

            System.out.println(entry.getKey());
        }
        System.out.println(out);

        Map<Integer, String> treeMap = new TreeMap<Integer, String>(hmap);

        for (Integer str : treeMap.keySet()) {
            System.out.println(str);
        }
        */


    }
}
