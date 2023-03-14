import java.lang.Math;

public class Exercise10 {
    public static void main(String[] args) {
        double smallResult = 0;
        double allResult = 0;
        int iteration;

        // Loop from 1 to 624
        for (iteration = 1; iteration <= 624; iteration++) {

            // Calculate for smallResult from this formula
            // (1 / ((Math.sqrt(iteration) + Math.sqrt(iteration + 1))))
            smallResult = (1 / ((Math.sqrt(iteration) + Math.sqrt(iteration + 1))));

            // Sum every caculated to allResult
            allResult += smallResult;
        }

        // Print out the result from the summation
        System.out.println("| The result of the following summation: " + allResult);

    }
}
