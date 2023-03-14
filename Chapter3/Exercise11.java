// Maths Quiz 
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bound of Random number
        int lowerNum = 10;
        int upperNum = 20;

        // 2DArray String Store Right Answer of Calculation
        String[][] answerList = new String[5][2];

        String question;

        // User Answer & correct answer
        double userAnswer = 0;
        double corAnswer = 0;
        // Count correct answer
        int count = 0;

        // Loop 5times for 5Questions Randomly
        for (int i = 0; i < 5; i++) {
            Double Num1 = (Math.floor(Math.random() * 1e2)) % (upperNum - lowerNum + 1) + lowerNum;
            Double Num2 = (Math.floor(Math.random() * 1e2)) % (upperNum - lowerNum + 1) + lowerNum;
            switch (i) {
                // Addition
                case 0:
                    corAnswer = Num1 + Num2;
                    question = String.format("%.0f + %.0f", Num1, Num2);
                    answerList[i][0] = question;
                    System.out.printf("Question %d: What is %s? Answer: ", i + 1, question);
                    userAnswer = input.nextDouble();
                    break;
                // Substraction
                case 1:
                    corAnswer = Num1 - Num2;
                    question = String.format("%.0f - %.0f", Num1, Num2);
                    answerList[i][0] = question;
                    System.out.printf("Question %d: What is %s? Answer: ", i + 1, question);
                    userAnswer = input.nextDouble();
                    break;
                // Multiplication
                case 2:
                    corAnswer = Num1 * Num2;
                    question = String.format("%.0f * %.0f", Num1, Num2);
                    answerList[i][0] = question;
                    System.out.printf("Question %d: What is %s? Answer: ", i + 1, question);
                    userAnswer = input.nextDouble();
                    break;
                // Division
                case 3:
                    corAnswer = Num1 / Num2;
                    question = String.format("%.0f / %.0f", Num1, Num2);
                    answerList[i][0] = question;
                    System.out.printf("Question %d: What is %s? Answer: ", i + 1, question);
                    userAnswer = input.nextDouble();
                    break;
                // Substraction
                case 4:
                    corAnswer = Num1 - Num2;
                    question = String.format("%.0f - %.0f", Num1, Num2);
                    answerList[i][0] = question;
                    System.out.printf("Question %d: What is %s? Answer: ", i + 1, question);
                    userAnswer = input.nextDouble();
                    break;
            }

            // User answer right
            if (corAnswer == userAnswer) {
                count++;
                answerList[i][1] = "Correct.";
            } else {
                answerList[i][1] = String.format("Incorrect. The correct answer is %.2f .", corAnswer);
            }
        }
        // Display Result
        System.out.printf("\nYou get %d correct answers out of %d. The detail is below:", count, answerList.length);
        for (int i = 0; i < answerList.length; i++) {
            System.out.printf("\nQuestion %d: %s \t%s", i + 1, answerList[i][0], answerList[i][1]);
        }

        input.close();
    }
}
