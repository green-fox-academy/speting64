import java.util.*;

// Add "a" to every string in the far list.


public class AppendLetter {

    public static void main(String... args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

        for (int i =0; i < far.size(); i++){

            StringBuilder farBuild = new StringBuilder(far.get(i));
            farBuild.append("a");

            far.set(i,farBuild.toString());
        }
        System.out.println(far);

    }
}
