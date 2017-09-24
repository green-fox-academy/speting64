import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TreeData {

    public static void main(String[] args){

        ArrayList<Map<String,Object>> dataMap = new ArrayList<Map<String,Object>>();

        Map<String, Object> data1 = new HashMap<String, Object>();
        data1.put("type", "Common Ash");
        data1.put("leaf color", "dull green");
        data1.put("age", "121");
        data1.put("sex", "Male");

        Map<String, Object> data2 = new HashMap<String, Object>();
        data2.put("type", "European Larch");
        data2.put("leaf color", "light green");
        data2.put("age", "90");
        data2.put("sex", "Female");

        Map<String, Object> data3 = new HashMap<String, Object>();
        data3.put("type", "White Spruce");
        data3.put("leaf color", "blue-green");
        data3.put("age", "178");
        data3.put("sex", "Male");

        Map<String, Object> data4 = new HashMap<String, Object>();
        data4.put("type", "Cherry Blossom");
        data4.put("leaf color", "white");
        data4.put("age", "25");
        data4.put("sex", "Male");

        Map<String, Object> data5 = new HashMap<String, Object>();
        data5.put("type", "California Palm");
        data5.put("leaf color", "gray green");
        data5.put("age", "87");
        data5.put("sex", "Female");
    }
}
