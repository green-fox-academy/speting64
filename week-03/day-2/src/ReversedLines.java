import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import  java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class ReversedLines {

    public static void main(String[] args) {
        reverseCode("src/reversed-line.txt");
    }

    public static void reverseCode(String filename){
        Path myPath = Paths.get(filename);

        try{
            List<String> newList = Files.readAllLines(myPath);

            for (int i = 0; i < newList.size()-1 ; i++) {
                for (int j =newList.get(i).length()-1; j >=0; j--){
                        System.out.println(newList.get(i).charAt(j));
                }
            }
        }catch(IOException e){
            System.out.println("NOT POSSIBLE");
        }
    }
}

