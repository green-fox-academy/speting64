import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import  java.util.List;

// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"

public class PrintEachLine {

    public static void main(String[] args) {

        Path myPath = Paths.get("src/my-file.txt");
        List <String> lines = null;
        try{
            lines = Files.readAllLines(myPath);
        }catch (IOException ex){
                System.out.println("Unable to read file: my-file.txt");
            } finally{
                System.out.println("Names:");
        }
        for (String line : lines){
            System.out.println(line);
        }
    }
}
