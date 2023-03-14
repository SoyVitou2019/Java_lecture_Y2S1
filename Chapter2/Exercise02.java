import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        // remove whitespace
        sentence = sentence.trim();
        // split sentence to word
        String[] wrd = sentence.split(" ");

        // Capitalize word and join ArrayString
        for (int i = 0; i < wrd.length; i++) {
            // split word to character
            String[] chr = wrd[i].split("");
            chr[0] = chr[0].toUpperCase();
            // Convert ArrayString to String
            String joinChar = String.join("", chr);
            wrd[i] = joinChar;
        }
        // Display
        for (int i = 0; i < wrd.length; i++) {
            System.out.print(wrd[i] + " ");
        }
        input.close();
    }
}