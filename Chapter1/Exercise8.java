public class Exercise8 {
    public static void main(String[] args) {
        float result = 0;
        float i = 1;
        // Loop from 1 to 97 and increment by 2
        for (i = 1; i <= 97; i += 2) {
            // Sum all every result from this formula [i+(i+2)] base on i
            result += i / (i + 2);
        }

        // Print out the result from loop above
        System.out.println("The Result of the following summation: " + result);
    }

}