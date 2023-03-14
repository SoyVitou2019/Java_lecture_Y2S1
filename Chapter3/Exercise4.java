// Sort a vector of points on y-coordinates
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        // set vector what you want
        int[][] vector = { { 3, 2 }, { 9, 1 }, { 4, 3 }, { 1, 6 }, { 4, 5 }, { 3, 1 }, { 7, 3 }, { 0, 4 }, { 3, 0 } };
        System.out.println(Arrays.deepToString(vector) + "\n");

        for (int i = vector.length - 1; i >= 0; i--) // loop i from vector.length to i=0
        {
            int[][] temp = new int[1][1]; // for swap iteam

            // loop j from j=0 until j=i-1
            for (int j = 0; j <= i - 1; j++) {
                // check y-axis, which is bigger move to the right
                if (vector[j][1] > vector[j + 1][1]) {
                    temp[0] = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = temp[0];
                }

                // check if y-axis equal
                if (vector[j][1] == vector[j + 1][1]) {
                    // swap which is bigger to the right
                    if (vector[j][0] > vector[j + 1][0]) {
                        temp[0] = vector[j + 1];
                        vector[j + 1] = vector[j];
                        vector[j] = temp[0];
                    }
                }

            }
        }

        System.out.println("\n" + Arrays.deepToString(vector) + "\n");
    }
}
