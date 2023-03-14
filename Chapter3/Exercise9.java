
// Financial tsunami
import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // List of the bank with
        // {Bank Money, lender count, 1st lender, Money lended to 1st lender, 2nd...}
        double[][] bankInfo = {
                { 25, 2, 1, 100.5, 4, 320.5 },
                { 125, 2, 3, 85, 2, 40 },
                { 175, 2, 0, 125, 3, 75 },
                { 75, 1, 0, 125 },
                { 181, 1, 2, 125 },
        };

        int bankCount = bankInfo.length; // bankCount = 5
        double[] eachBankOwn = new double[bankCount]; // Array of money that each bank own
        double[][] lenderList = new double[5][5];// lender list for each bank with number

        int lenderCount = 0;

        System.out.print("\nEnter limit: ");
        int limit = input.nextInt();

        // To store bank's number if there is any unsafe bank
        int[] unsafeBank = new int[5];
        Arrays.fill(unsafeBank, 10000); // {1000, 1000, 1000, 1000, 1000}

        for (int i = 0; i < eachBankOwn.length; i++) {

            eachBankOwn[i] = bankInfo[i][0]; // {25, 125, 175, 75, 181}
            lenderCount = (int) bankInfo[i][1]; // {2, 2, 2, 1, 1}

            int m = 0;
            for (int j = 1; j <= lenderCount; j++) {
                lenderList[i][(int) bankInfo[i][j + m + 1]] = bankInfo[i][j + 2 + m]; // Ex: for fourth bank
                                                                                      // {125, 0, 0, 0, 0}
                m++;
            }
        }

        for (int j = 0; j < bankCount; j++) {
            for (int k = 0; k < bankCount; k++) {
                int total = 0;
                for (int l = 0; l < lenderList.length; l++) {
                    total += lenderList[k][l]; // Ex: for forth bank
                                               // 125 + 0 + 0 + 0 + 0 = 125
                }
                // 125 + 75 = 200 < limit (201) => True
                if (total + eachBankOwn[k] < limit) {
                    for (int m = 0; m < bankCount; m++) {
                        lenderList[m][k] = 0; // fourth bank borrowed from second bank 85
                        // first bank total - 85
                    }
                    unsafeBank[k] = k; // Store unsafe bank
                }
            }
        }

        // Print out unsafe bank from {1000, 1, 1000, 1000, 3, 1000}
        System.out.print("Unsafe banks are ");
        int count = 0;
        for (int k = 0; k < unsafeBank.length; k++) {
            if (unsafeBank[k] < 5) {
                count++;
                System.out.print(unsafeBank[k] + " ");
            }
        }
        if (count == 0) {
            System.out.print(": Error 404 Not Found xD");
        }

        input.close();
    }
}