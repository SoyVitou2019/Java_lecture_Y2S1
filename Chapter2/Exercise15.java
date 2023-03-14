import java.util.Random;

public class Exercise15 {
    public static void main(String[] args) {

        int round = 10000;

        // Declare Multidimension array to store 6 choices of division
        // Each choice store survival rate of each bowls
        double[][] divide = { { 1, 0 }, { 1, 0.25 }, { 1, 0.4 }, { 0.75, 0 }, { 0.6, 0 }, { 0.67, 0.33 },
                { 0.5, 0.5 } };
        double[][] randomPick = new double[7][round];

        // Loop Array and random pick one bowls from each choice for 100 times
        // Store result to new array
        for (int i = 0; i < divide.length; i++) {

            for (int j = 0; j < round; j++) {

                int random = new Random().nextInt(divide[i].length);

                randomPick[i][j] = divide[i][random];

            }
        }

        double sumRate;

        System.out.println("\nThe number of survival rate of each choice: \n");

        // Check result from each choice
        for (int i = 0; i < divide.length; i++) {

            // Reset sum of each rate
            sumRate = 0;

            // Search for each rate and sum it up from array
            for (int j = 0; j < round; j++) {
                sumRate += randomPick[i][j];
            }

            // Print out structure in detail of each choice
            switch (i) {
                case 0:
                    System.out.print(i + 1 + ".[ \t3 white \t| \t3 black\t\t] = ");
                    break;
                case 1:
                    System.out.print(i + 1 + ".[ \t2 white \t| 1 white and 3 black \t] = ");
                    break;
                case 2:
                    System.out.print(i + 1 + ".[ \t1 white \t| 2 white and 3 black \t] = ");
                    break;
                case 3:
                    System.out.print(i + 1 + ".[ \t2 black \t| 1 black and 3 white \t] = ");
                    break;
                case 4:
                    System.out.print(i + 1 + ".[ \t1 black \t| 2 black and 3 white \t] = ");
                    break;
                case 5:
                    System.out.print(i + 1 + ".[ 2 white and 1 black | 2 black and 1 white \t] = ");
                    break;
                case 6:
                    System.out.print(i + 1 + ".[ 1 white and 1 black | 2 black and 2 white \t] = ");
                    break;
            }

            // Calculate for survival rate in each choice of 2 bowls
            float chanceRate = (float) (sumRate) / round * 100;

            // Print out each percentage
            System.out.print(chanceRate + "%\n\n");

        }

    }
}
