import java.util.ArrayList;
import java.util.List;

public class Menu {

    ArrayList<String> content;
    public void File() {

        content = new ArrayList<>();
        content.add("Command Line Todo application");
        content.add("=============================");
        content.add("-l   Lists all the tasks");
        content.add("-a   Adds a new task");
        content.add("-r   Removes a task");
        content.add("-c   Completes a task");
        content.add("-u [id] [new todo description]");
        for (int i = 0; i < content.size(); i++) {
            System.out.println(content.get(i));
        }
    }
}
