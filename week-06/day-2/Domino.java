import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    public int compareTo (Domino domino){
        int value1 = domino.values[0];
        return values[0] - value1;
    }

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));


        Collections.sort(dominoes);
        System.out.println(dominoes.toString());

    }
}


