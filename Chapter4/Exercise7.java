// Sort characters in a string
import java.util.Scanner;

public class Exercise7 {
    public static String sort(String sentence) {
        char temp;
        char[] charactor = sentence.toCharArray();
        String reSentence;

        // Convert sentence to Array char
        charactor = sentence.toCharArray();

        // Sort Array by bubble
        for (int i = 0; i < charactor.length - 1; i++) {
            for (int j = 0; j < charactor.length - i - 1; j++) {
                if (charactor[j] > charactor[j + 1]) {
                    temp = charactor[j];
                    charactor[j] = charactor[j + 1];
                    charactor[j + 1] = temp;
                }
            }
        }

        // To String
        reSentence = String.valueOf(charactor);

        return reSentence;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display For User Input
        System.out.println("Enter a String: ");
        String sentence = input.nextLine();
        input.close();

        sort(sentence);
        // Display Result
        System.out.println(sort(sentence));
    }
}
