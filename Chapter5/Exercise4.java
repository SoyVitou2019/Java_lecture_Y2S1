
/*Random Generate 10 unsorted Integer(1-10) in ArrayList, Display Missing Integer(1-10)*/
import java.util.ArrayList;
import java.util.Random;

public class Exercise4 {
      public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>(10);
            Random rand = new Random();
            // Generate Number 1-10 add in arrayList
            for (int i = 0; i < 10; i++) {
                  arrayList.add(rand.nextInt(10)+1);
            }
            // Display Random Array
            System.out.print("Random ArrayList: " + arrayList);

            // Display Missing Value 1 to 10
            System.out.print("\nThe missing number(s) is/are: ");
            // Find None-Matching Num
            for (int i = 1; i < 11; i++) {
                  if (!arrayList.contains(i)) {
                        System.out.print(i + " ");
                  }
            }
      }
}