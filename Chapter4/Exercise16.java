
// Method Remove Integer Using Standard Array
import java.util.Scanner;

class Exercise16 {

    static void removeInt(int[] array, int arraySize) {

        int initSize = arraySize; // to check is size is changing?
        Scanner input = new Scanner(System.in);

        // Print out oringinal array
        System.out.println("Arrays: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nSize: " + arraySize);

        // Ask user to input number
        System.out.print("\nInput number to remove from array: ");
        int number = input.nextInt();
        input.close();

        for (int i = 0; i < arraySize; i++) {

            // if element of index i is equal to input number
            if (array[i] == number) {
                int temp = 0;

                // loop from the current element till the last
                // swap element by put any number equal to input number to last element
                for (int j = i; j < arraySize - 1; j++) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

                // decrement size
                arraySize--;
            }
        }

        // it means nothing has change, or no input number in array
        if (arraySize == initSize) {

            System.out.println("\nThere is no the number in the array.");

        } else {

            // else, print back array after changed
            System.out.println("\n\nAfter remove: ");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\nSize: " + arraySize);
        }

    }

    public static void main(String[] args) {

        // The array
        int[] array = { 10, 20, 23, 34, 29, 3, 12, 23, 19, 23 };
        int arraySize = array.length;

        // Call removeInt function with input number, array, and its size.
        removeInt(array, arraySize);

    }
}