import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int sum = 0;
        int iteration = 0;
        char choice = 'y';
        while (choice == 'y') {

            // Ask user to input 2 numbers
            System.out.printf("Enter number %d :", iteration);
            number1 = input.nextInt();
            iteration += 1;
            System.out.printf("Enter number %d :", iteration);
            number2 = input.nextInt();
            iteration += 1;

            // Sum these two numbers together
            sum = number1 + number2 + sum;

            // Ask user if they want to continue
            System.out.printf("Are you want to continue adding? (y/n) :", iteration);
            choice = input.next().charAt(0);
        }

        // Display Sum on console
        System.out.println("The Total number is :" + sum);
        input.close();
    }

}
