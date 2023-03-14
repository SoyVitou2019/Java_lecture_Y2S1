
//Ask the user to enter integer in range[0,999]
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        int oneDigit;
        int tenDigit;
        int hundredDigit;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        // String array to store name number in English
        String[] oneName = { "Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen" };

        String[] tenName = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        String[] hundredName = { "", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred" };

        // Loop the program
        while (value != -1) {

            // if the number that input under 20 run the program here
            if (value < 20) {
                String result = oneName[value];
                System.out.println(" " + result);
                value = input.nextInt();

            }

            // if the number that input between 20 to 99 run this program
            else if (value >= 20 && value < 100) {
                oneDigit = value % 10;
                tenDigit = value / 10;

                // if the oneDigit under 1 print program here
                if (oneDigit < 1) {
                    System.out.println(" " + tenName[tenDigit]);

                }

                // else print this
                else {
                    System.out.println(" " + tenName[tenDigit] + " " + oneName[oneDigit]);

                }
                value = input.nextInt();

            }

            // if the number that input between 100 to 999 run this program
            else if (value >= 100 && value < 1000) {

                oneDigit = value % 100 % 10;
                tenDigit = value % 100 / 10;
                hundredDigit = value / 100;

                // for the number 100, 200, 300,.....
                if (value % 100 == 0) {
                    System.out.println(" " + hundredName[hundredDigit]);

                }

                // for the number hundred with number1-9
                else if (value % 100 < 10) {
                    System.out.println(" " + hundredName[hundredDigit] + "and" + oneName[oneDigit]);
                }

                // for the number hundred with number 10-19
                else if (value % 100 < 20) {
                    System.out.println(" " + hundredName[hundredDigit] + " and " + oneName[oneDigit + 10]);

                    // for the number 120,130,140.......
                } else if (value % 100 % 10 == 0) {
                    System.out.println(" " + hundredName[hundredDigit] + " and " +
                            tenName[tenDigit]);

                }

                // else print this
                else {
                    System.out.println(
                            " " + hundredName[hundredDigit] + " and " + tenName[tenDigit] + " "
                                    + oneName[oneDigit]);

                }
                value = input.nextInt();

            }

            // if user input out of range print this and stop the program
            else if (value > 1000 || value < 0) {
                System.out.println(" You inter number out of range -,-");
                break;
            }
        }
        input.close();
    }

}
