import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {

        // create string array called names
        String names[] = { "Cambodia", "Russia", "china", "Zambaway" };
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        // print output array
        System.out.print("The names in alphabetical order are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
