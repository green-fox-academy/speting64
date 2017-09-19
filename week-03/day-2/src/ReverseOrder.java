import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReverseOrder {

    public static void main(String[] args) {
        reverseOrder("src/reversed-order.txt");
    }

    public static void reverseOrder(String filename){
        Path myPath = Paths.get(filename);

        try{
            List<String> newList = Files.readAllLines(myPath);

            for (int i = newList.size()-1; i >=  0 ; i--){
                    System.out.println(newList.get(i));
                }
            }catch(IOException e){
            System.out.println("NOT POSSIBLE");
        }
    }
}
