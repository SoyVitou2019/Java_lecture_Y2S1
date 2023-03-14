
// TicTacToe Game
import java.util.Scanner;

public class Exercise12 {

    // 2D Array represent Game board
    static String[][] board = {
            { "1", "2", "3" },
            { "4", "5","6" },
            { "7", "8", "9" } };

    static boolean checkDup(int userInput) {

        // Convert int to string
        String userInputString = String.valueOf(userInput);
        int count = 0;

        // Loop to find location in array by userinput
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (userInputString.equals(board[i][j])) {
                    count = 1;
                }
            }
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }

    }

    // Display Game board
    static void printBoard() {
        System.out.println("\n|---|---|---|");
        for (int i = 0; i < board.length; i++) {
            System.out.println("| " + board[i][0] + " | "
                    + board[i][1] + " | " + board[i][2]
                    + " |");
            // Divide Block
            if (i != board.length - 1) {
                System.out.println("|-----------|");
            }
        }
        System.out.println("|---|---|---|");
    }

    static boolean checkBoard() {
        // Condition Win
        if ((board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
                (board[1][0] == board[1][1] && board[1][1] == board[1][2]) ||
                (board[2][0] == board[2][1] && board[2][1] == board[2][2]) ||
                (board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
                (board[0][1] == board[1][1] && board[1][1] == board[2][1]) ||
                (board[0][2] == board[1][2] && board[1][2] == board[2][2]) ||
                (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            return true;
        }
        // Lose
        return false;
    }

    public static void main(String[] args) {

        boolean xTurn = true;
        String player = "X";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            printBoard();
            boolean winner = checkBoard();

            // Won
            if (winner) {
                System.out.printf("\nPlayer %s won.\n\n", player);
                input.close();
                return;
            }
            // Draw
            else if (i == 9 && !winner) {
                System.out.println("\nDraw\n");
                input.close();
                return;
            }
            // Input Player X
            if (xTurn) {
                player = "X";
                System.out.print("\nEnter square number for player X: ");
            }
            // Input Player O
            else {
                player = "O";
                System.out.print("\nEnter square number for player O: ");
            }
            int userInput = input.nextInt();

            // Taken Place
            if (checkDup(userInput)) {
                i--;
                System.out.println("\nThe place is taken. Please enter other number.");
                continue;
            } else {
                xTurn = !xTurn;
            }

            // "X" in board which user input
            switch (userInput) {
                case 1:
                    board[0][0] = player;
                    break;
                case 2:
                    board[0][1] = player;
                    break;
                case 3:
                    board[0][2] = player;
                    break;
                case 4:
                    board[1][0] = player;
                    break;
                case 5:
                    board[1][1] = player;
                    break;
                case 6:
                    board[1][2] = player;
                    break;
                case 7:
                    board[2][0] = player;
                    break;
                case 8:
                    board[2][1] = player;
                    break;
                case 9:
                    board[2][2] = player;
                    break;
            }
        }
        input.close();
    }
}
