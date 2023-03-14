// Iterate over a 2D array diagonally right down using pointer
public class Exercise3 {
    public static void main(String[] args) { 
        //Create 2D Array
        int[][] squareArray = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        // Check Square Array
        for (int i = 0; i < squareArray.length; i++) {
            if (squareArray.length == squareArray[0].length) {
                if (squareArray[0].length != squareArray[i].length) {
                    //Display
                    System.out.println("This is not a square array.");
                    return;
                }
            } else {
                //Display
                System.out.println("This is not a square array.");
                return;
            }
        }
                
        // Iteration until length of Array[4][4]
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                //Display
                System.out.printf("%-5d", squareArray[squareArray.length - 1 - i + j][j]);
            }
            System.out.print("\n");
        }
        
        // Iteration continue from Array[0][0] to end Array
        for (int i = 0; i < squareArray.length - 1; i++) {
            for (int j = 0; j < squareArray.length - 1 - i; j++) {
                //Display
                System.out.printf("%-5d", squareArray[j][i + j + 1]);
            }
            System.out.print("\n");
        }
    }
}
