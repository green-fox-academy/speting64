import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import  java.util.List;
import java.util.ArrayList;
import java.io.IOException;


// Create a method that decrypts the duplicated-chars.txt

public class Doubled {

    public static void main(String[] args) {

        decryptCode("src/duplicated-chars.txt");

    }

    public static void decryptCode(String filename){

        Path myPath = Paths.get(filename);

        try{
            List<String> newList = Files.readAllLines(myPath);

            for (int i = 0; i < newList.size() ; i++) {
                for (int j =0; j < newList.get(i).length()-1; j++){
                    if(newList.get(i).charAt(j) == newList.get(i).charAt(j + 1)){

                        System.out.println(newList.get(i).charAt(j));
                    }
                }
                
            }


        }catch(IOException e){

            System.out.println("NOT POSSIBLE");


        }




    }
}


