import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        // Loop the code until the input number is bigger than 5
        while (number <= 5) {

            // Ask user to input number
            System.out.print("Enter number :");
            number = input.nextInt();
        }
        // Print out every number that user input
        System.out.println("The last number you entered was a :" + number);
        input.close();
    }
}
