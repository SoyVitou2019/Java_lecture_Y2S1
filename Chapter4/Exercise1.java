// Class: ITE-G8-Y2-A
// Group06:
// 1. Chhoeng Khengseang
// 2. Soy Vitou
// 3. Yoo Seryvathana
// 4. Lany Malis

// Split Method
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        // declear new scanner object
        Scanner input = new Scanner(System.in);

        // ask user input
        System.out.print("Enter a sentence :");
        String userInput = input.nextLine();

        // output using method split(str)
        System.out.println(Arrays.toString(split(userInput)));

        // close scanner object
        input.close();
    }

    // split method
    public static String[] split(String userInput) {

        String tempTrim = "";
        int countSpace = 0;

        // These loop use it's for strip string or clear it's to unique string
        for (int i = 0; i < userInput.length(); i++) {
            // count space
            if (userInput.charAt(i) == ' ' && userInput.charAt(i + 1) != ' ') {
                countSpace++;
            }
            // check A to z
            if (userInput.charAt(i) + 0 > 64 && userInput.charAt(i) + 0 < 123) {
                tempTrim += userInput.charAt(i) + "";
            }

            // check for append one space to temp's string
            else if (userInput.charAt(i) == ' ') {
                // check if it've space more than 1
                if (userInput.charAt(i + 1) != ' ') {
                    tempTrim += userInput.charAt(i) + "";
                }
            }

        }

        // 3 space must be have 4 word);
        countSpace++;
        String[] templist = new String[countSpace];
        int start = 0;
        int keep_i = 0;
        int end = 0;
        String temp = "";

        // split string word by word to list
        for (int i = 0; i < tempTrim.length(); i++) {
            // check space
            if (tempTrim.charAt(i) == ' ') {
                end = i;

                // substring ex: "Hello world".substring(2,6) = "llo w"
                temp = tempTrim.substring(start, end);

                // assign word into list
                templist[keep_i] = temp;

                // inceasing i : 1 -> 2 -> 3 ...
                keep_i++;
                // increase start index
                start = i + 1;
            }
            // use it for last word
            end = i + 1;
        }

        // assign last word into list
        templist[keep_i] = tempTrim.substring(start, end);

        // return arrays of string
        return templist;
    }
}