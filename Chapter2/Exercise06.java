import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        // Ask user to input hexadecimal number
        Scanner input = new Scanner(System.in);
        System.out.print("Input Hexadecimal number: ");
        String inputString = input.next();

        // if user input all hexadecimal number, print thank you
        if (inputString.matches("^[0-9A-Fa-f]+$")) {
            System.out.println("\nThank you\n");
        } else { // if not all hexadecimal number, print not hexadecimal
            System.out.println("\nThis is not a hexadecimal.\n");
        }
        input.close();
    }
}
