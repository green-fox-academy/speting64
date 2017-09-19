import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {

    public static void main(String[] args) {
        System.out.println(LineCount());
    }

    public static int LineCount(){
        int linesNum = 0;
        Path myPath = Paths.get("src/my-file.txt");
        try {
            List<String> lines = Files.readAllLines(myPath);
            linesNum = lines.size();
        } catch (IOException ex) {
            System.out.println("0");
        }
        return linesNum;
    }
}
