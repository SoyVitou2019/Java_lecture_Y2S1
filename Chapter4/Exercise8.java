// Method isAnagram
import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {
    public static boolean isAnagram(char[] fSen, char[] sSen) {
        // Different size
        if (fSen.length != sSen.length) {
            return false;
        }
        // Sort char array
        Arrays.sort(fSen);
        Arrays.sort(sSen);

        // All different char
        for (int i = 0; i < fSen.length; i++) {
            if (fSen[i] != sSen[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input word 1
        System.out.print("Enter a word: ");
        String fSentence = input.nextLine();
        // Input word2
        System.out.print("Enter another sentene: ");
        String sSentence = input.nextLine();

        input.close();
        // Convert to char Array
        char[] fSen = fSentence.toCharArray();
        char[] sSen = sSentence.toCharArray();
        // Pass in method
        isAnagram(fSen, sSen);
        // Condition
        if (isAnagram(fSen, sSen) == true) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
