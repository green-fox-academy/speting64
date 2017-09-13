// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {

    public static void main(String... args){

        String todoText = " - Buy milk\n";
        todoText = todoText.concat( " - Download games\n");
        todoText = todoText.concat( " - Play Diablo\n");

        System.out.println(todoText);
    }
}
