// Class: ITE-G8-Y2-A
// Group06:
// 1. Chhoeng Khengseang
// 2. Soy Vitou
// 3. Yoo Seryvathana
// 4. Lany Malis

// Shuffle Row in 2D Array
public class Exercise13 {
  public static void shuffleRows(char[][] array2D) {

    // Declaring for generate index and store
    int randomIndex;
    char[] temp;

    // For Loop for Shuffling each index with its random
    for (int i = 0; i < array2D.length; i++) {

      // Random Index for swap
      randomIndex = (int) (Math.random() * 4);

      // Avoiding Swapping the same index
      if (randomIndex == i) {
        continue;
      }

      // Swapping each i index with its RandomIndex
      temp = array2D[i];
      array2D[i] = array2D[randomIndex];
      array2D[randomIndex] = temp;
    }
  }
  public static void main(String[] args) {
    char[][] array2D = {
        { 'A', 'A', 'A', 'A' },
        { 'B', 'B', 'B', 'B' },
        { 'C', 'C', 'C', 'C' },
        { 'D', 'D', 'D', 'D' }
    };

    // Call Method in Main
    shuffleRows(array2D);

    // Display
    for (int i = 0; i < array2D.length; i++) {
      System.out.print("[");
      for (int j = 0; j < array2D[i].length; j++) {
        System.out.print(" " + array2D[i][j]);
      }
      System.out.print(" ]");
      System.out.print("\n");
    }
  }
}