import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// convert dicimals to binaryBeforeFloatingPointsry
public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // we use checkpoint for checking the number asking from user dicimal or
        // integer.
        boolean checkPoint = false;

        double numberAfterFloatingPoints = 0;
        int numberBeforeFloatingPoints = 0;

        String binaryBeforeFloatingPoints = "";
        String binaryAfterFloatingPoints = "";

        int remainder;
        int result;
        System.out.print("Input decimal number: ");
        // asking from user to convert number to binary.
        String deci = input.next();
        // check if the number ask from user have . floating point.
        // if . floating point has at in integer that user input it will return it's
        // greater than -1.
        // if not it return less than -1
        if (deci.indexOf(".") != -1) {
            numberAfterFloatingPoints = Double.parseDouble(deci);
            numberBeforeFloatingPoints = (int) numberAfterFloatingPoints;
            // 234.354513524 we assume 234.354513524 - 234 = 0.354513524
            // 0.354513524 * 10^6 = 354513 and than 354513 / 10^6 = 0.354513
            numberAfterFloatingPoints = Math
                    .floor((numberAfterFloatingPoints - Math.floor(numberAfterFloatingPoints)) * 1e6) / 1e6;
            checkPoint = true;
        } else {
            numberBeforeFloatingPoints = Integer.parseInt(deci);
        }
        System.out.print("\nThe Decimal number " + deci + " to Binary is ");
        // This loop process checking for convert front of floating points to
        // binaryBeforeFloatingPointsry
        for (int i = numberBeforeFloatingPoints; i > 0; i = (numberBeforeFloatingPoints / 2)) {
            // Every remainder has 0 and 1
            // Ex: 21%2 remainder is 1 and 22%2 remainder is 0
            remainder = numberBeforeFloatingPoints % 2;
            result = numberBeforeFloatingPoints / 2;
            // convert interger to string and add it into binary before floating point
            binaryBeforeFloatingPoints += String.valueOf(remainder);
            numberBeforeFloatingPoints = result;
            // check if number equal 1 automatic add 1 into binary
            if (numberBeforeFloatingPoints == 1) {
                binaryBeforeFloatingPoints += "1";
            }
        }
        // This loop process checking for convert after floating points to bianary
        if (deci.indexOf(".") != -1) {
            for (int j = 0; j < 8; j++) {
                // Ex: 0.354513 * 2 = 0.709026 we floor it every loop
                // 0.709026 *2 = 1.418052 and than we check if remainder = 0 we add 0 to binary
                // after floating points
                numberAfterFloatingPoints = numberAfterFloatingPoints * 2;
                remainder = (int) Math.floor(numberAfterFloatingPoints);

                if (remainder == 0) {
                    binaryAfterFloatingPoints += String.valueOf(remainder);
                } else if (remainder == 1) {
                    binaryAfterFloatingPoints += String.valueOf(remainder);
                    // we want 1.418052 t0 0.418052 and than get 0.418052 * 2 and .. so on.
                    numberAfterFloatingPoints = Math.floor((numberAfterFloatingPoints - Math.floor(remainder)) * 1e6)
                            / 1e6;
                }
            }
        }
        String[] arr_binaryBeforedot = new String[binaryBeforeFloatingPoints.length()];
        // 12345 -> 54321
        arr_binaryBeforedot = binaryBeforeFloatingPoints.split("");
        for (int i = binaryBeforeFloatingPoints.length() - 1; i >= 0; i--) {
            System.out.print(arr_binaryBeforedot[i]);
        }
        // checkpoints use for check if it have floating points or not.
        // if it's not it will assign value to false
        if (checkPoint) {
            System.out.print("." + binaryAfterFloatingPoints);
        }
        input.close();
    }

}
