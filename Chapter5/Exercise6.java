/*Method generateEmirp(n) with ArrayList */
import java.util.ArrayList;

/*
 * 1. checks if the current number num is prime
 * 2. checks if its reversal is also prime
 * 3. current number not equal reversal ( number ) 
 * 4. if three condition above met than add number to emirps arrlist if not go on.
 */

public class Exercise6 {

    public static void main(String[] args) {
        // call function generateEmirp and display its
        System.out.println(generateEmirp(20));
    }
    public static ArrayList<Integer> generateEmirp(int n) {
        // call object arrlist as Integer
        ArrayList<Integer> emirps = new ArrayList<>();
        // num representation number of loop go through
        int num = 2;
        // check required of user
        while (emirps.size() < n) {
            // check conditin that has describe above
            if (isPrime(num) && isPrime(reverse(num)) && num != reverse(num)) {
                // add element to emirps arrlist
                emirps.add(num);
            }
            // increase step loop by one
            num++;
        }
        // return result
        return emirps;
    }
    // declearation method check is prime numbe or not
    public static boolean isPrime(int num) {
        // check if number == 1 break method because its not prime auto
        if (num <= 1){
            return false;
        }
        // you only need to check for divisors up to the square root of number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        // succes checking
        return true;
    }
    // declearation reverse method
    public static int reverse(int num) {
        int reversedNum = 0;
        // when number under 10 divisor by 10 equal zero, so if end of string stop while loop
        while (num != 0) {
            // 149 % 10 = 9
            int digit = num % 10; 
            // revers = 0 * 10 + 9
            reversedNum = reversedNum * 10 + digit;
            // num = 149/10 = 14
            num /= 10;
        }
        // return result
        return reversedNum;
    }
}