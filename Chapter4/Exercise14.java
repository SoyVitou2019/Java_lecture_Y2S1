// Shuffle Column in 2D Array
public class Exercise14 {
  // method for shuffle column of array2D
  public static void shuffleCollums(char[][] array2D) {

    int suffle = 0;
    char[][] temp = new char[4][1]; // to store element for swap

    // the times that suffle
    while (suffle < 8) {
      // random column
      int column = (int) (Math.random() * 4);

      // swap column
      for (int i = 0; i < 4; i++) {
        temp[i][0] = array2D[i][0];
        array2D[i][0] = array2D[i][column];
        array2D[i][column] = temp[i][0];
      }

      suffle++; // move up suffle by increase 1
    }

  }

  public static void main(String[] args) {
    // store array2D like below
    char[][] array2D = {
        { 'A', 'B', 'C', 'D' },
        { 'A', 'B', 'C', 'D' },
        { 'A', 'B', 'C', 'D' },
        { 'A', 'B', 'C', 'D' }
    };

    // call method to suffle column
    shuffleCollums(array2D);

    // display the lastest resulf of arrays2D
    for (int i = 0; i < 4; i++) {

      for (int j = 0; j < 4; j++) {
        System.out.print(array2D[i][j] + " ");
      }
      System.out.println();

    }
  }
}