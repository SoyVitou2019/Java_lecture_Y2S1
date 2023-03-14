
// Check Valid Password
import java.util.Scanner;

public class Exercise10 {
    public static final int PASSWORD_LENGTH = 8;
    public static final int UPPER_COUNT = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have exactly 8 characters.\n" + // done
                        "2. A password must consists of only letters and digits.\n" + // done
                        "3. A password must always start with a digit. \n" + // done
                        "4. A password must contain at least one uppercase letter.\n" +
                        "Input a password : ");
        // ask user input
        String str = input.nextLine();
        input.close();
        // check if paswrod valid
        if (is_Valid_Password(str)) {
            System.out.println("Password is valid: " + str);
        } else {
            System.out.println("Not a valid password: " + str);
        }
    }

    public static boolean is_Valid_Password(String password) {
        // mark password length as PASSWORD_LENGTH(8)
        while (password.length() == PASSWORD_LENGTH) {
            int charUpCount = 0;
            int charlowerCount = 0;
            int numCount = 0;
            // check for digits at the start of password
            if (is_Numeric(password.charAt(0))) {
                numCount++;

            } else {

                System.out.println("A password must always start with a digit");
                return false;
            }
            // check it have upcase or lowercase
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (isUpperCase(ch)) {
                    charUpCount++;
                }

                else if (isLowerCase(ch)) {
                    charlowerCount++;
                }

                else if (is_Numeric(ch)) {
                    numCount++;
                } else { // if use enter another char than letter or digit
                    System.out.println("A password must consists of only letters and digits.");
                    return false;
                }
            }

            // is there are no uppercase
            if (charUpCount < 1) {
                System.out.println("A password must contain at least one uppercase letter.");
            }
            return (charUpCount >= UPPER_COUNT && numCount >= 1 && charlowerCount >= 1);

        }

        System.out.println("A password must have exactly 8 characters");
        return false;

    }

    // function to check uppercase
    public static boolean isUpperCase(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }

    // function to check lowercase characters
    public static boolean isLowerCase(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');
    }

    // function to check digits
    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

}
