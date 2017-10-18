import java.io.*;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class LotteryFilter {

    public static void main(String[] args) {
        LotteryFilter lottery = new LotteryFilter();
        lottery.checkArguments(args);
    }

    private List<String[]> lines;
    private List<String[]> newLine = new ArrayList<String[]>();
    private String source ="main/java/otos.csv" ;
    private String dest = "main/java/output.csv";

    void checkArguments(String[] args) {

        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("y")) {
            if (options.has("f")) {
                source = options.valueOf("f").toString();
            }
            if (options.has("o")) {
                dest = options.valueOf("o").toString();
            }
            fileRead();
            fileFilter(options.valueOf("y").toString());
            fileWrite();
            }else {
            System.out.println("cannot");
            }
        }

    private void fileRead() {
        try{
            CSVReader reader = new CSVReader(new FileReader(source));
            lines = reader.readAll();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileFilter(String year){
        for(String[] line : lines){
            if(line[0].equals(year)){
                newLine.add(line);
            }
        }
    }

    private void fileWrite(){
        try{
            CSVWriter writer = new CSVWriter(new FileWriter(dest));
            writer.writeAll(newLine);
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}








