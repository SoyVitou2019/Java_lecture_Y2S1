public class Exercise5 {
    public static void main(String[] args) {
        int n = 0;
        int nCubed = 0;

        // loop code until nCubed >= 11000
        while (nCubed < 11000) {
            n++;
            nCubed = (int) (Math.pow(n, 3));
        }
        // Convert from odd number to even number
        if (n % 2 == 1) {
            n = n - 1;
        }
        // Display ouput
        System.out.println("The highest integer below 11000 is " + n + ".");
    }
}