import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    List<String> content = new ArrayList<>();

    public void openPrintUsageFile() {

        this.content = new ArrayList<>();
        try {

            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/printusage.txt");
            Files.write(myPath, content);

        } catch (IOException ex) {
            System.out.println("Unable to read file");
        }
    }
    public void openWriteTasks(){

        try {
            Path myPath = Paths.get("C:/Users/Viktorlukács/greenfox/speting64-todo-app/src/printusage.txt");
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException ex) {

            System.out.println("Unable to read file");
        }
    }
}
