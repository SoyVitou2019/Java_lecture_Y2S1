// Twin primes
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {

        // ask user input
        int x = 1200;

        // display result using twinPrime methods
        displayTwinPrime(x);
    }

    // method for find twinPrime number
    public static void displayTwinPrime(int x) {
        int countPrime = 0;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        // add all prime number in arrayList
        for (int i = 2; i < x; i++) {
            count = 0;

            for (int j = 1; j <= i; j++) {
                // check divisibled number ex: 4 : 1,2,4 mean count = 3
                if (i % j == 0) {
                    count++;
                }
            }
            // check if it a prime number
            if (count == 2) {
                countPrime++;
                arrayList.add(i);
            }
        }
        // find twin prime number
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < countPrime - 1; i++) {
            // check twin value x(2) - 2 = x(1)
            if (arrayList.get(i) == arrayList.get(i + 1) - 2) {
                // add x(2) & x(1) into result
                result.add(arrayList.get(i));
                result.add(arrayList.get(i + 1));
                // step 2 by 2
                // i++;
            }

        }
        // Display the result
        for (int i = 0; i < result.size(); i += 2) {

            System.out.println("(" + result.get(i) + "," + result.get(i + 1) + ")");

        }
    }
}