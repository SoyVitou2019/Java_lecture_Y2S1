// Iterate over a 2D array diagonally right up using pointers
public class Exercise2 {
    public static void main(String[] args) {

        // Create 2D Array
        int[][] squareArray = {
                { 1, 2, 3, 9, 11, 15, 12 },
                { 6, 7, 8, 8, 0, 9, 9},
                { 11, 12, 13, 12, 5, 6, 9 },
                { 1, 2, 3, 9, 11, 15, 12 },
                { 1, 2, 3, 9, 11, 15, 12 },
                { 1, 2, 3, 9, 11, 15, 12 },
                { 1, 2, 3, 9, 11, 15, 12 },
        };

        // Check Square Array
        for (int i = 0; i < squareArray.length; i++) {
            if (squareArray.length == squareArray[0].length) {
                if (squareArray[0].length != squareArray[i].length) {
                    System.out.println("This is not a square array.");
                    return;
                }
            } else {
                System.out.println("This is not a square array.");
                return;
            }
        }
        
        // Iteration until length of Array[0][0]
        for (int i = 1; i <= squareArray.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%-3d", squareArray[i - j - 1][j]);
            }
            System.out.print("\n");
        }
        // Iteration continue from Array[0][0] to end Array
        for (int i = 1; i < squareArray.length; i++) {
            int k = i;
            for (int j = squareArray.length - 1; j > i - 1; j--) {
                System.out.printf("%-3d", squareArray[j][k]);
                k++;
            }
            System.out.print("\n");
        }
    }

}
