import java.util.Scanner;

public class Exercise14 {

    // make array, random and replace
    private static String[] words = { "zombie", "yo-yo", "handsome", "beautiful", "friendly", "water", "teaacher" };
    private static String wordRan = words[(int) (Math.random() * words.length)];
    private static String secretWord = new String(new char[wordRan.length()]).replace("\0", "*");
    private static int count = 0;

    // input letter that you guess
    public static void main(String[] args) {
        Scanner inputLetter = new Scanner(System.in);

        while (count < 6 && secretWord.contains("*")) {
            System.out.println("Guess any letter in the word (note: - including): ");
            System.out.println(secretWord);
            String guess = inputLetter.next();
            check(guess);
        }
        inputLetter.close();
    }

    // this function for check your guess
    public static void check(String guess) {
        String lastGuess = "";
        for (int i = 0; i < wordRan.length(); i++) {
            if (wordRan.charAt(i) == guess.charAt(0)) {
                lastGuess += guess.charAt(0);
            } else if (secretWord.charAt(i) != '*') {
                lastGuess += wordRan.charAt(i);

            } else {
                lastGuess += "*";
            }
        }

        if (secretWord.equals(lastGuess)) {
            count++;
            hangmanImage();
        } else {
            secretWord = lastGuess;
        }
        if (secretWord.equals(wordRan)) {
            System.out.println("Awesome! You guess the correct word! The word is " + wordRan);
            System.out.println("You won this game");
        }
    }

    // this function for print image
    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess TT, plz try again -,-");
            System.out.println("You have 5 more chanece");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess TT, plz try again -,-");
            System.out.println("You have 4 more chanece");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess TT, plz try again -,-");
            System.out.println("You have 3 more chanece");
            System.out.println("");
            System.out.println("   |          __");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess TT, plz try again -,-");
            System.out.println("You have 2 more chanece");
            System.out.println("");
            System.out.println("   |          __");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess TT, plz try again -,-");
            System.out.println("You have 1 more chanece");
            System.out.println("");
            System.out.println("   |          __");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 6) {
            System.out.println("GAME OVER! You're died.");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + wordRan);
        }
    }
}