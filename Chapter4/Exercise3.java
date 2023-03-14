// Generate Palindromes by User input Quantity they want to display
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user input
        System.out.print("Enter amount (100) :");
        int want = input.nextInt();
        // call class palidrome function
        System.out.println(palindrome(want));
        // close input
        input.close();
    }

    public static Object palindrome(int want) {
        // call new object arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean True = true;
        int k = 0;
        // create palidrome and assign value into arraylist object
        while (True) {
            int count = 0;
            // count amount of diviser
            for (int i = 0; i < (k + "").length() / 2; i++) {
                if ((k + "").charAt(i) + 0 == (k + "").charAt((k + "").length() - 1 - i) + 0) {
                    count++;
                }
            }
            // check count if count equal half of length
            if (count == (k + "").length() / 2 && Integer.valueOf((k + "")) % 2 == 0) {
                arrayList.add(Integer.valueOf((k + "")));
            }
            // check if array size equal what would user want.
            if (arrayList.size() == want) {
                break;
            }
            k++;
        }
        // return results.
        return arrayList;
    }
}
