import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int computer_num = 50;
        int iteration = 1;
        while (number1 != computer_num) {
            // Ask user input number
            System.out.print("Enter number :");
            number1 = input.nextInt();

            // Giving Condition and Display
            if (number1 < computer_num) {
                System.out.println("The value you gussed was too low. let's try again!");
            } else if (number1 > computer_num) {
                System.out.println("The value you gussed was too high. let's try again!");
            } else if (number1 == computer_num) {
                System.out.println("=================================================");
                System.out.printf("Well done, you took [%d] attempts.\n", iteration);
                System.out.println("=================================================");
            }
            iteration += 1;
        }
        input.close();
    }
}
