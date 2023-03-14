public class Exercise16 {
    public static void main(String[] args) {

        // Declare array of survival number in 1000 rounds
        // Declare survival rate of each number
        int[] arrayOfSurvival = new int[1000];
        float[] arrayOfSurvivalRate = new float[6];

        float count = 0;

        float biggestRate = 0;
        int biggestRateIndex = 0;

        int upperBound = 6;
        int lowerBound = 1;

        // Random number from 1 - 6 to find one survival in each round for 1000 times
        for (int i = 0; i < 1000; i++) {
            arrayOfSurvival[i] = (int) (Math.floor(Math.random() * 1e2)) % (upperBound - lowerBound + 1) + lowerBound;
        }

        // Count for each number count and calculate for its percentage in 1000 times
        for (int i = 1; i <= 6; i++) {
            count = 0;
            for (int j = 0; j < arrayOfSurvival.length; j++) {
                if (i == arrayOfSurvival[j]) {
                    count = count + 1;
                }
            }
            // Store each percentage in new array
            arrayOfSurvivalRate[i - 1] = count / 1000;
        }

        // Find highest survival rate of number from 1-6
        for (int i = 0; i < arrayOfSurvivalRate.length; i++) {
            if (arrayOfSurvivalRate[i] > biggestRate) {
                biggestRate = arrayOfSurvivalRate[i];
                biggestRateIndex = i;
            }
        }

        // Print out highest rate
        System.out.println("The highest chance of survival is number: " + (biggestRateIndex + 1));
    }
}
