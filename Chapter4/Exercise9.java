
// Method removeSubstring
import java.util.Scanner;

class Exercise9 {
    public static void main(String[] args) {
        // Initialize String
        String string = "Hello The world Og Bobby";
        System.out.println("===================");
        System.out.println(string);
        Scanner input = new Scanner(System.in);
        // Ask user input
        System.out.print("Enter Remove : ");
        String subStr = input.nextLine();
        // class function RemoveSub
        System.out.println(RemoveSub(string, subStr));
        input.close();

    }

    // create function Remove substring
    public static String RemoveSub(String string, String gg) {
        String temp = "";
        string = string + gg;
        int end = string.length() - gg.length();
        // remmove substring
        for (int i = 0; i < end; i++) {
            if (gg.equals(string.substring(i, i + gg.length()))) {
                i += gg.length();
            }
            temp += string.charAt(i);
        }
        return temp;
    }
}