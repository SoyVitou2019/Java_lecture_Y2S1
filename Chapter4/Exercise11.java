// Method Verbose
import java.util.Arrays;

public class Exercise11 {

    // Array stores name of each digit
    static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    static String[] tens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "nighteen", "nineteen" };
    static String[] twenToNine = { "", "", "twenty", "thirthy", "fourty", "fifty", "sixty", "seventy", "eighty",
            "ninety" };

    // Convert any 3 digits number to word
    static String ThreeDigit(int[] list) {
        String word = "";
        if (list[0] != 0) {
            word += ones[list[0]] + " hundred "; // 3xx == 3 hundred ..
        }
        if (list[1] == 1) { // if second degit is tens number, use tens array
            word += tens[list[2]];// 316 == Three Hundred sixteen

        } else if (list[1] == 0 && list[2] != 0) {// if second digit is 0, use ones array
            word += ones[list[2]]; // 306 == Three Hundred six

        } else if (list[2] != 0) {// if third digit is not 0, print with ones digit
            word += twenToNine[list[1]] + "-" + ones[list[2]];// 365 == Three hundred sixty-five

        } else {// if third digit is 0, use only twenToNine array
            word += twenToNine[list[1]]; // 320 == Three hundred twenty
        }
        return word;
    }

    // convert any 2 digits number to words
    static String TwoDigit(int[] list) {
        String word = "";
        if (list[0] == 1) { // if first digit is 1, consider it is tens number
            word = tens[list[1]]; // 14 => tens[4] == fourteen
        } else {
            if (list[1] != 0) { // if first digit is not 0, consider it is number from 20 to 99
                word = twenToNine[list[0]] + "-" + ones[list[1]]; // 54 => twenToNine[5] + "-" + ones[4]
            } else { // if last digit is 0
                word = twenToNine[list[0]]; // 30 => twenToNine[3] == Thirty
            }
        }

        return word;
    }

    // Start Verbos Function
    static String verbose(int number) {

        // Create list that length based on parameter length
        // To store seperate digit of input number
        int[] list = new int[String.valueOf(number).split("").length];

        int n = number; // Copy number to n
        int k = String.valueOf(number).split("").length - 1; // Store length of input number

        while (n > 0) { // loop to store each digit of number in new array
            list[k] = n % 10;
            n = n / 10;
            k--;
        }

        int arrLen = list.length;

        String word = "";
        // Check for number of digit
        switch (arrLen) {

            case 1: // 1 digit
                word = ones[number]; // 5 == Five
                break;

            case 2: // 2 digits
                word = tens[list[1]]; // 12 == Twelve
                break;

            case 3: // 3 digits
                word = ThreeDigit(list); // Take the array of 3 digits, and calculate with ThreeDigit function
                break;

            case 4: // 4 digits
                word = ones[list[0]] + " thousand "; // check first digit and print out with "thousand"
                word += ThreeDigit(Arrays.copyOfRange(list, 1, arrLen)); // Take last 3 digits and call ThreeDigit
                break;

            case 5:// 5 digits
                word = TwoDigit(Arrays.copyOfRange(list, 0, 2)); // Take first 2 digit and use with TwoDigit function
                word += " thousand, "; // include thousand
                word += ThreeDigit(Arrays.copyOfRange(list, 2, arrLen)); // take last 3 digit and call ThreeDigit
                break;

            case 6: // 6 digits
                word = ThreeDigit(Arrays.copyOfRange(list, 0, 3)); // Take first 3 digits to calculate
                word += " thousand, "; // inluce thousand
                word += ThreeDigit(Arrays.copyOfRange(list, 3, arrLen)); // Take last 3 digits to calculate
                break;

            case 7: // 7 digits
                word = (ones[list[0]] + " million "); // Check first digit and print out with million
                word += ThreeDigit(Arrays.copyOfRange(list, 1, 4)) + " thousand, "; // Take next 3 digits to calculate
                word += ThreeDigit(Arrays.copyOfRange(list, 4, arrLen));// Take last 3 digits to calculate
                break;

            case 8:// 8 digits
                word = TwoDigit(Arrays.copyOfRange(list, 0, 2)) + " million "; // Take first 2 digits to calculate
                word += ThreeDigit(Arrays.copyOfRange(list, 2, 5)) + " thousand, "; // Take next 3 digits to calculate
                word += ThreeDigit(Arrays.copyOfRange(list, 5, arrLen));// Take last 3 digits to calculate
                break;

            case 9: // 9 digits
                word = ThreeDigit(Arrays.copyOfRange(list, 0, 3)) + " million, "; // Take first 3 digits to calculate
                word += ThreeDigit(Arrays.copyOfRange(list, 3, 6)) + " thousand, ";// Take next 3 digits to calculate
                word += ThreeDigit(Arrays.copyOfRange(list, 6, arrLen));// Take last 3 digits to calculate
                break;
        }

        return word;
    }

    public static void main(String[] args) {
        int number = 238728373;
        System.out.println(verbose(number)); // Call verbose function with number
    }
}
