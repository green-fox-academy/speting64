import java.util.ArrayList;

public class Tasks {

    ArrayList<String> content;
    public void readTask(ArrayList<String> taskList) {

        content = new ArrayList<>();
        content.add("Walk the dog");
        content.add("Buy Milk");
        content.add("Do Homework");
        for (int i = 0; i < content.size(); i++) {
            System.out.println(content.get(i));
        }
    }
}
