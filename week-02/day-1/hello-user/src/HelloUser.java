import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // The program should ask for the name of the user

        String userName = scanner.nextLine();

        System.out.println("Hello," + userName);
    }


}
