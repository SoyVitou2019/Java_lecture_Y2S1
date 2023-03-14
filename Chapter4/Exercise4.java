
// Generate Palindromic Primes (first 120 number)
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user input
        System.out.println("Input amount of first PalinPrime :");
        int want = input.nextInt();

        // display using generate Palindromic Primes methods
        generatePalidromicPrimes(want);
        input.close();
    }

    public static void generatePalidromicPrimes(int want) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k = 0;
        int count_prime_want = 0;
        boolean True = true;
        while (True) {
            int count = 0;

            // append all palindrome number into list
            for (int i = 0; i < (k + "").length() / 2; i++) {
                // counting each side of length ex: 1234321 count = 3 so we check only 123
                if ((k + "").charAt(i) + 0 == (k + "").charAt((k + "").length() - 1 - i) + 0) {
                    count++;
                }
            }

            int countThis = 0;
            // if count equal half-length of k so it palindrome number
            if (count == (k + "").length() / 2) {
                // add k in arraylist of palindrome
                arrayList.add(Integer.valueOf((k + "")));

                // check prime or just only palindrome number
                for (int m = 1; m <= arrayList.get(arrayList.size() - 1); m++) {
                    if (arrayList.get(arrayList.size() - 1) % m == 0) {
                        // count n divided
                        countThis++;
                    } else if (countThis > 2) {
                        break;
                    }
                }
                if (countThis == 2) {
                    count_prime_want++;
                }
            }
            // select amount of palindrom first ex: 0, 1, 2, 3, 4, ..., 11, 22, 33, ... , N
            // size
            if (count_prime_want == want) {
                True = false;
            }
            k++;
        }

        int count = 0;

        // create new object arraylist of result
        ArrayList<Integer> arrayListOfPrime = new ArrayList<>();
        // add all prime number in arrayList
        for (int i = 0; i < arrayList.size(); i++) {
            count = 0;
            for (int j = 1; j <= arrayList.get(i); j++) {
                // check divisibled number ex: 4 : 1,2,4 mean count = 3
                if (arrayList.get(i) % j == 0) {
                    count++;
                }
            }
            // check if it a prime number
            if (count == 2) {
                arrayListOfPrime.add(arrayList.get(i));
            }
        }
        // display only palindromic primes number
        int slashN = 0;
        for (int i = 0; i < arrayListOfPrime.size(); i++) {

            // display 10 numbers per line, separated by exactly one space
            if (slashN == 10) {
                slashN = 0;
                System.out.print("\n");
            }
            slashN++;
            System.out.printf("%3d ", arrayListOfPrime.get(i));
        }
    }
}
