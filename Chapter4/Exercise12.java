// find the value of the second largestnumber 
class Exercise12 {

    public static int secondLargest(int[][] array2D) {

        int secondLargest = 0;

        // New Array that length based on input array
        int[] newArray = new int[array2D.length * array2D[0].length];

        // Process to store all elements in 2D array to only 1D array
        int k = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                newArray[k] = array2D[i][j];
                k++;
            }
        }

        // Take new 1D array and sort it out from large to small
        for (int i = 1; i < newArray.length; i++) {
            int temp = 0;
            // Compare current element to the previous element
            for (int j = i; j > 0; j--) {
                // If the previous element is bigger than the current one,
                // swap element
                if (newArray[j - 1] < newArray[j]) {
                    temp = newArray[j];
                    newArray[j] = newArray[j - 1];
                    newArray[j - 1] = temp;
                }
            }
        }

        // Second largest is to number in second index == 1
        // First index is the larges number
        secondLargest = newArray[1];

        return secondLargest;
    }

    public static void main(String[] args) {
        int[][] array = {
                { 34, 56, 2, 6, 78, 23, 7 },
                { 95, 34, 9, 2, 53, 28, 21 },
                { 92, 23, 87, 34, 18, 30, 3 }
        };
        System.out.println("The second largest number in array is: " + secondLargest(array));
    }
}