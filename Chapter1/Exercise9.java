public class Exercise9 {
    public static void main(String[] args) {
        int testNum;
        int tempNum;
        int perfectNum;
        int iteration;

        System.out.println("\nFour Perfect Number under 10000: ");

        // Loop from 1 to 10000
        for (testNum = 1; testNum < 10000; testNum++) {
            tempNum = 0;
            // Loop from 1 until the TestNum (base on loop above)
            for (iteration = 1; iteration < testNum; iteration++) {

                // Check if testnum is divisble by i, sum iteration to tempNum
                if (testNum % iteration == 0) {
                    tempNum += iteration;
                }
            }

            // Check if testNum equals to tempNum so it's a perfect number and print it out
            if (testNum == tempNum) {
                perfectNum = testNum;
                System.out.println("Perfect Number: " + perfectNum);
            }
        }
    }
}
