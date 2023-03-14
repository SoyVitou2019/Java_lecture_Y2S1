//Guess the capitals
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {

        // 2D array with first element is country name, and second is its capital
        String[][] lists = {
                { "Cambodia", "Phnom Penh" },
                { "Thailand", "Bangkok" },
                { "Vietnam", "Hanoi" },
                { "China", "Beijing" },
                { "Japan", "Tokyo" },
                { "India", "Delhi" },
                { "Malaysia", "Vathana" }
        };

        int currentIndex = lists.length;
        int randomIndex;

        // Shuffle array in random position
        String[][] temp = new String[1][1];
        while (currentIndex != 0) {
            randomIndex = (int) (Math.floor(Math.random() * currentIndex));
            currentIndex--;

            temp[0] = lists[currentIndex];
            lists[currentIndex] = lists[randomIndex];
            lists[randomIndex] = temp[0];
        }

        // Declare variable for user input
        Scanner input = new Scanner(System.in);
        String userInput = "";
        int correctCount = 0;

        // Loop array one by one for each country
        // Ask user one by one until out of country in array
        for (int i = 0; i < lists.length; i++) {

            // Ask user the question
            System.out.println("\nWhat is the capital of " + lists[i][0] + "?");
            System.out.print("Answer: ");
            userInput = input.nextLine();

            String compareString = lists[i][1];// Contains capital of current country

            // Convert both answer and user input to one word and lowercase
            if (userInput.contains(" ") || compareString.contains(" ")) {
                userInput = userInput.replace(" ", "");
                compareString = compareString.replace(" ", "");
            }
            userInput = userInput.toLowerCase();
            compareString = compareString.toLowerCase();

            // Compare current capital to user's answer
            if (userInput.equals(compareString)) {
                // If correct print "correct" with answer
                System.out.println("Correct, the capital of " + lists[i][0] + " is " + lists[i][1]);
                correctCount += 1;
            } else {
                // If wrong print "wrong" with answer
                System.out.println("Wrong, the capital of " + lists[i][0] + " is " +
                        lists[i][1] + ".");
            }
        }

        // After end loop, print how many user got answer corrected
        System.out.println("\nYou got " + correctCount + " out of " + lists.length + ".\n");

        input.close();

    }
}
