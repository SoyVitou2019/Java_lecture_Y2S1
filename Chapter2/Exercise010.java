import java.util.Scanner;
// Convert Hexadecimal to decimal number.

public class Exercise010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // asking user input number.
        System.out.print("Enter Hex number :");
        String userAsking = input.nextLine();
        input.close();
        double output_end = 0;
        int value = 0;
        String[] arrOfString = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
        String[] arrayAllAskingUser = userAsking.split("");
        int total_length = arrayAllAskingUser.length;

        // find fraction points.
        int dot = userAsking.indexOf(".");

        // declearation for power of convertor.
        int count = total_length - 1;

        // declear for break loop when the value out of range haxadecimals.
        int fackeValue = value;
        boolean checkpoints = true;

        // check if it's fraction points change coutn to dot - 1.
        if (dot > -1) {
            count = dot - 1;
        }
        for (int i = 0; i <= total_length - 1; i++) {

            if (dot > -1) {

                // loop find multiplier of product.
                for (int j = 0; j < 16; j++) {
                    if (arrayAllAskingUser[i].compareToIgnoreCase(arrOfString[j]) == 0) {
                        value = j;
                    }

                }

                // break loop if it haven't in haxadecimals
                if (fackeValue == value) {
                    checkpoints = false;
                    System.out.println("===========================================");
                    System.out.println("This number is not haxadecimals numbers.");
                    System.out.println("===========================================");
                    break;
                }

                // check for skip fraction point.
                if (count == 0) {
                    i++;
                }
            }

            // check for if the numbe input by user haven't fraction points.
            if (dot < 0) {
                value = Integer.parseInt(arrayAllAskingUser[i]);
            }

            fackeValue = value;
            // method for convert haxadecimal to decimals number.
            output_end += value * Math.pow(16, count);
            count--;
        }

        // display answer for output number.
        if (checkpoints != false) {
            System.out.println("===========================================");
            System.out.println("The decimals number is : " + output_end);
            System.out.println("===========================================");
        }

    }
}
