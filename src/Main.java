
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        //input messages for testing
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Message:");
        String message = scan.nextLine();

        System.out.println("Enter diff:");
        String diff = scan.nextLine();


        CaeserCrypt.messageDisplay(
                CaeserCrypt.EncryptCaeser(message,diff));

    }
}