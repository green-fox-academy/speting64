import java.util.ArrayList;
import java.util.List;

public class Sum {

    //public  ArrayList<Integer> list;
    ArrayList<Integer> integer = new ArrayList<Integer>();
    //int elements =10;
    int result = 0;

    public int getSum(ArrayList<Integer> integer) {
        if (integer==null){
            return 0;
        }
        if (integer.size() == 1){
            return 1;
        }
        for (int i = 0; i < integer.size(); i++) {
            result += integer.get(i);
        }
        return result;
    }
}
