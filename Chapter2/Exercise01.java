// Group06: ITE-G8-Y2-A (Afternoon)
// 1. Lany Malis
// 2. Choeng Khengseang
// 3. Yoo Seryvathana
// 4. Soy Vitou

import java.util.Scanner;
import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int wlength = 0;
        int count = 0;

        System.out.println("Enter a sentence: ");
        String userSentence = input.nextLine();

        // Trim sentence
        userSentence = userSentence.trim();

        // Split word in sentence
        String[] wordS = userSentence.split(" ");
        String[] word2 = new String[wordS.length];

        for (int i = 0; i < wordS.length; i++) {
            // check word length and compare with the previous longest
            if (wordS[i].length() > wlength) {
                count = 0;
                Arrays.fill(word2, null); // for fill on empty element in array by null
                wlength = wordS[i].length();
                word2[count] = wordS[i];
                count++;
            }
            // Incase Multiple longest word
            else if (wordS[i].length() == wlength) {
                word2[count] = wordS[i];
                count++;
            }
        }
        // Display the longest word ignore null
        for (int i = 0; i < word2.length; i++) {
            if (word2[i] != null) {
                System.out.print(word2[i] + " ");
            }
        }
        input.close();
    }
}
