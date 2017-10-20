import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTask {

    java.util.List<String> tasks = new ArrayList<>();

    public void listing(){

        ArrayList<String> content;

            content = new ArrayList<>();
            content.add("Walk the dog");
            content.add("Buy Milk");
            content.add("Do Homework");
            for (int i = 0; i < content.size(); i++) {
                System.out.println(content.get(i));
            }
        try {
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/taskstodo.txt");
            List<String> tasks = Files.readAllLines(myPath);
            if (tasks.size() == 0) {
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + " " + tasks.get(i));
                }
            }
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
    public void addStuff(String[] input) {

        for (int i = 1; i < input.length; i++) {
            tasks.add(input[i] + " ");
        }
    }
    public int check() {

        return this.tasks.size();
    }

    public void remove(String[] input) {

        try {
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/taskstodo.txt");
            List<String> tasks = Files.readAllLines(myPath);
            if(tasks.size() ==0 ){
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + " " + tasks.get(i));
                }
            }
        } catch (IOException ex) {
            System.out.println("Unable to write file: list");
        }
    }
}


