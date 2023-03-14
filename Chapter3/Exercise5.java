// Algebra: add two matrices
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0;
        boolean isSquareArray = true;

        // Input Size Square Array
        System.out.print("Enter ? x ? matrix you want: ");
        int matrixLength = input.nextInt();

        // Size Array
        int allElement = matrixLength * matrixLength;
        int[][] resultArray = new int[matrixLength][matrixLength];

        // Create Array
        int[][] squareArray = new int[matrixLength][matrixLength];
        int[][] squareArray1 = new int[matrixLength][matrixLength];

        // Input element in Matrix1
        System.out.print("Enter Matrix 1st matrix of " + matrixLength + " x " +
                matrixLength + ", by enter "
                + allElement + " elements: ");
        input.nextLine();
        String[] inputStrArr = input.nextLine().split(" ");

        // Input element in Matrix2
        System.out.print("\nEnter Matrix 2nd matrix of " + matrixLength + " x " +
                matrixLength + ", by enter "
                + allElement + " elements: ");
        String[] inputStrArr1 = input.nextLine().split(" ");
        input.close();

        // Check Square Array & Convert from String to Integer
        if (inputStrArr.length == allElement && inputStrArr1.length == allElement) {
            for (int i = 0; i < matrixLength; i++) {
                for (int j = 0; j < matrixLength; j++) {
                    squareArray[i][j] = Integer.parseInt(inputStrArr[m]);
                    squareArray1[i][j] = Integer.parseInt(inputStrArr1[m]);
                    m++;
                }
            }
        } else {
            System.out.println("Please enter with number of require elements.");
            return;
        }

        // Sum 2 Array
        if (isSquareArray) {
            for (int i = 0; i < squareArray.length; i++) {
                for (int j = 0; j < squareArray[i].length; j++) {
                    resultArray[i][j] = squareArray[i][j] + squareArray1[i][j];
                }
            }
        }
        // Display
        System.out.println("\nThe sum of 2 matrix is: ");
        // Display Matrix1
        System.out.println("\nMatrix 1: ");
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.printf("%-5d", squareArray[i][j]);
            }
            System.out.print("\n");
        }
        // Display Matrix1
        System.out.println("\nMatrix 2: ");
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.printf("%-5d", squareArray1[i][j]);
            }
            System.out.print("\n");
        }
        // Display Result
        System.out.println("\nResult: ");
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.printf("%-5d", resultArray[i][j]);
            }
            System.out.print("\n");
        }
    }
}
