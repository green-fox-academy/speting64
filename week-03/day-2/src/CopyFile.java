import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

public class CopyFile{

    public static void main(String[] args) {
        Path myPath = Paths.get("src/my-file.txt");
        Path myPath2 = Paths.get("src/my-file2.txt");
        System.out.println(Copy("src/my-file.txt","src/my-file2.txt"));
    }

    public static boolean Copy (String file1, String file2){
        Path myPathFirst = Paths.get(file1);
        Path myPathSecond = Paths.get(file2);
        try{
            Files.copy(myPathFirst,myPathSecond);
        }catch (IOException e){
            System.out.println("NoT POSSIBLE");
            return false;
        }
        return true;
    }
}
