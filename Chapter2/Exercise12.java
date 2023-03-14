import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input by user
        System.out.print("Input binary number: ");
        String inputNumber = input.nextLine().trim();
        input.close();

        // Find dot in inputNumber
        int dotIndex = inputNumber.indexOf('.');
        String hexa = "";
        String[] binToHex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

        int value = dotIndex;
        int fractionPart = 0;

        // not found dot
        if (dotIndex < 0) {
            value = inputNumber.length();
        } else {
            fractionPart = inputNumber.substring(dotIndex + 1).length();
        }

        // add leading 0
        if (value % 4 != 0) {
            String zero = "0";
            inputNumber = zero.repeat(4 - (value % 4)) + inputNumber;
        }

        // add trailing 0
        if (fractionPart % 4 != 0) {
            String zero = "0";
            inputNumber += zero.repeat(4 - (fractionPart % 4));
        }

        dotIndex = inputNumber.indexOf(".");
        // remove . from inputNumber to make it easy to covert
        inputNumber = inputNumber.replace(".", "");
        int hexDigit = 0;

        // convert 4 bit to 1 digit hex
        while (inputNumber.length() >= 4) {
            hexDigit = 0;
            for (int i = 0; i < 4; i++) {
                hexDigit += Character.getNumericValue(inputNumber.charAt(i)) * Math.pow(2, 3 - i);
            }
            hexa += binToHex[hexDigit];
            if (inputNumber.length() == 4)
                break;
            inputNumber = inputNumber.substring(4);
        }

        // add the dot to place
        if (fractionPart > 0) {
            hexa = hexa.substring(0, dotIndex / 4) + "." + hexa.substring(dotIndex / 4);
        }

        System.out.println("Hexadecimal number: " + hexa);
    }
}
