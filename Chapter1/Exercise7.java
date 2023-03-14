public class Exercise7 {
    public static void main(String[] args) {
        int start;
        int end = 200;
        int iteration = 0;
        int i = 0;

        // creating and set arraysize
        int[] arr = new int[100];
        // start for loop from 100 to 200
        for (start = 100; start <= end; start++) {
            if (start % 5 == 0 || start % 6 == 0) {
                if (start % 5 == 0 && start % 6 == 0) {
                    continue;
                }

                arr[iteration] = start;
                System.out.print(arr[iteration] + " ");

                iteration += 1;
                i += 1;
            }
            // for new line
            if (i == 10) {
                System.out.print("\n");
                i = 0;
            }
        }
    }
}
