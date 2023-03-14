import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {

        int count = 0;
        boolean[] allLocker = new boolean[456]; // Declare an array for all doors

        // Open = true
        // Close = false

        // Close all door by fill array with false
        Arrays.fill(allLocker, false);
        for (int i = 1; i <= allLocker.length; i++) {
            // if player 1, open all door
            if (i == 1) {
                Arrays.fill(allLocker, true);
            } else if (i == 2) { // if player 2, close door from 2 - 456
                Arrays.fill(allLocker, 1, allLocker.length, false);
            } else { // if otherplayer, close or open every door with number that can be
                // divisible by
                // player number
                for (int j = i; j < allLocker.length; j += i) {
                    allLocker[j] = !allLocker[j];
                }
            }
        }

        // Print out only open door nmber and count all open door after game end
        System.out.println("\nAll open doors: \n");
        for (int i = 1; i < allLocker.length; i++) {
            if (allLocker[i]) {
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.print("\n");
                }
            }
        }
        System.out.println("\n\nThere are " + count + " open doors after the game end.\n");
    }
}
