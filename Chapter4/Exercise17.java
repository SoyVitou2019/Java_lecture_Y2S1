// Method Remove Dupplicate Using Standard Array
import java.util.Scanner;

class Exercise17 {

    static void removeDup(int[] array, int arraySize) {

        int initSize = arraySize; // to check for any changing

        // Print out original zin array
        System.out.println("Before remove: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nSize: " + arraySize);

        Scanner input = new Scanner(System.in);

        // ask user for number
        System.out.print("Input number duplicate number to remove from array: ");
        int number = input.nextInt();
        input.close();

        for (int i = 0; i < arraySize; i++) {
            // if element equal to input number
            if (array[i] == number) {
                // loop from the next element that equal till last element
                for (int k = i + 1; k < arraySize; k++) {

                    // if any element from the rest that equal to input number
                    // Move them to the side and decrement array size
                    if (array[k] == number) {
                        int temp = 0;
                        for (int j = k; j < arraySize - 1; j++) {
                            temp = array[j + 1];
                            array[j + 1] = array[j];
                            array[j] = temp;
                        }
                        arraySize--;
                    }
                }
            }
        }

        // if size if still the same, no input number in array
        if (arraySize == initSize) {
            System.out.println("\nThere isn't the number in the array.");
        } else {

            // if size is change, print out array after remove
            System.out.println("\nAfter remove: ");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\nSize: " + arraySize);
        }

    }

    public static void main(String[] args) {

        // Original zin zin array and length
        int[] array = { 10, 20, 23, 34, 29, 3, 12, 23, 19, 23 };
        int arraySize = array.length;

        // call removeDup function with input number, array, and its size.
        removeDup(array, arraySize);

    }
}