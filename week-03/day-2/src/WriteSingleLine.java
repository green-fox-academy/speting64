import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

public class WriteSingleLine {
    public static void main(String[] args) {
        Path myPath = Paths.get("src/my-file.txt");
        List <String> lines = null;
        List<String> newList = new ArrayList<>();
        newList.add("Szabó Viktor Lukács");
        try {
            lines = Files.readAllLines(myPath);
            Files.write(myPath, newList, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to write in : my-file.txt");
        }
        for (String line : lines){
            System.out.println(line);
        }
    }
}
