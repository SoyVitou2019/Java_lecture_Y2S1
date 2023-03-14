import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countPositive = 0, countNegative = 0, totalAll = 0, iteration = 1;
        double average = 0, totalPositive = 0, totalNegative = 0;
        int number = 1;
        System.out.print("Enter number :");
        // loop number different from 0
        while (number != 0) {
            iteration += 1;
            number = input.nextInt();
            totalAll += number;
            // condition number < 0
            if (number < 0) {
                totalNegative += number;
                countNegative += 1;
            }
            // condition number > 0
            if (number > 0) {
                totalPositive += number;
                countPositive += 1;
            }
        }
        average = (totalPositive + totalNegative) / iteration;
        // Displaying all output
        System.out.println("The count of positives is " + countPositive);
        System.out.println("The count of negatives is " + countNegative);
        System.out.println("The total of positives is " + totalPositive);
        System.out.println("The total of negatives is " + totalNegative);
        System.out.println("The total boths positive and negatives is " + totalAll);
        System.out.println("The average boths is " + average);
        input.close();
    }
}
