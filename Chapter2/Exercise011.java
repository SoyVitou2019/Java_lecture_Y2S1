import java.util.Scanner;

public class Exercise011 {
    public static void main(String args[]) {
        int i = 0, lengthHexa;
        String hexaNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number: ");
        hexaNum = input.nextLine().trim();

        lengthHexa = hexaNum.length();

        // Convert String to Char store in Array
        char[] hexChar = hexaNum.toCharArray();

        System.out.print("Binary Number: ");

        // loop every char in array
        while (i < lengthHexa) {
            // Compare hexChar[i] to case
            switch (hexChar[i]) {
                case '0':
                    System.out.print("0000");
                    break;
                case '1':
                    System.out.print("0001");
                    break;
                case '2':
                    System.out.print("0010");
                    break;
                case '3':
                    System.out.print("0011");
                    break;
                case '4':
                    System.out.print("0100");
                    break;
                case '5':
                    System.out.print("0101");
                    break;
                case '6':
                    System.out.print("0110");
                    break;
                case '7':
                    System.out.print("0111");
                    break;
                case '8':
                    System.out.print("1000");
                    break;
                case '9':
                    System.out.print("1001");
                    break;
                // Case Sensitive
                case 'a':
                case 'A':
                    System.out.print("1010");
                    break;
                case 'b':
                case 'B':
                    System.out.print("1011");
                    break;
                case 'c':
                case 'C':
                    System.out.print("1100");
                    break;
                case 'd':
                case 'D':
                    System.out.print("1101");
                    break;
                case 'e':
                case 'E':
                    System.out.print("1110");
                    break;
                case 'f':
                case 'F':
                    System.out.print("1111");
                    break;
                case '.':
                    System.out.print(".");
                    break;
                default:
                    System.out.println("It is not Hexadecimal number.");
                    return;
            }
            i++;
        }
    }
}