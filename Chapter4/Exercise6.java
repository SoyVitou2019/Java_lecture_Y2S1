
// Method countOccurences
import java.util.Random;

public class Exercise6 {

    public static void countOccurrence(int[] array) // function to store the random number and find the count Occurrence
    {

        int countOcc = 0; // to count occurrence time

        System.out.println();

        // loop for count the occurrence time
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                // if the value have one time so count 1
                if (array[j] == array[i]) {

                    countOcc++;

                }

                else // otherwise continue
                {

                    continue;

                }

            }

            // Diplay the number occurrence time
            System.out.println(array[i] + " Occurremce " + countOcc + " time ");

            countOcc = 0; // back count from 0 again

        }

    }

    public static void main(String[] arg) {
        Random rand = new Random(); // Method random number
        int[] array = new int[20]; // To store number as array only 20 element

        // loop for take random number in to array
        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(100); // random between 0-100
            System.out.print(array[i] + "  ");
            // Display the number after random
        }

        countOccurrence(array);

    }
}