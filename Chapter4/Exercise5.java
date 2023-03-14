/* ITE-G8-Y2-A-Group06
    1. Chhoeng Khengseang
    2. Soy Vitou
    3. Yoo Seryvathana
    4. Lany Malis
 */

// Method displayLargest
import java.util.Scanner;

public class Exercise5 {

    public static void displayLargest(int arrayNumber[], int size) // function store the array integer, size and find
                                                                   // the largest number
    {
        int largestNum = 0; // to store the largest number

        largestNum = arrayNumber[0]; // store the first value in array

        // loop for find the largest integer number
        for (int i = 0; i < size; i++) {

            // if largestNum smaller than other do this step
            if (largestNum < arrayNumber[i]) {

                largestNum = arrayNumber[i];

            }

        }

        // Display the largestNum
        System.out.println("The largest integer number is: " + largestNum);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take size from user input
        System.out.print("Input size of array integers: ");
        int size = input.nextInt();

        // make array to store integer number
        int[] arrayNumber = new int[size];
        System.out.print("Input any numbers that you want as integers: ");

        // to store the integers number into array
        for (int i = 0; i < size; i++) {

            arrayNumber[i] = input.nextInt();

        }

        input.close();

        displayLargest(arrayNumber, size); // call function to can store and diplay the interger number

    }

}
