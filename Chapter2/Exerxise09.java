// Group06 (ITE-Y2-G8-A)
// 1 Choeng Khengseang
// 2 Yoo Seryvathana
// 3 Soy Vitou
// 4 Lany malis

import java.util.Scanner;

class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user input decimal number

        System.out.print("Enter decimal number :");
        String stringAsk = input.nextLine();
        input.close();
        String oBefFract = "";
        int convert = 0;
        String fraction = "";
        double tempInfract = 0;
        String oBefFract_afterFraction = "";

        String[] arrOfString = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

        // convert before fraction into Hexadecimal.
        float integ = Float.parseFloat(stringAsk);
        for (int i = (Double.toString(Math.floor(Float.parseFloat(stringAsk)))).length(); i > 0; i--) {
            convert = (int) integ % 16;
            if (convert == 0) {
                break;
            }
            oBefFract += arrOfString[convert];
            integ = integ / 16;
        }
        // cut fraction in value ask user input
        if (stringAsk.indexOf(".") > -1) {
            String[] fraction_all = stringAsk.split("");
            for (int i = stringAsk.indexOf(".") + 1; i < fraction_all.length; i++) {
                fraction += fraction_all[i];
            }

            double fract = (Double.parseDouble(fraction) / (int) (Math.pow(10, fraction.length())));

            for (int i = 0; i < 20; i++) {
                tempInfract = fract * 16;
                oBefFract_afterFraction += arrOfString[(int) tempInfract];
                fract = tempInfract - (int) tempInfract;
                if (fract == 0) {
                    break;
                }

            }
        }

        // display oBefFract as array of strings.
        String[] oBefFract2 = oBefFract.split("");
        System.out.println("=====================================");
        // reverse oBefFract before fraction
        for (int i = oBefFract2.length - 1; i >= 0; i--) {
            System.out.print(oBefFract2[i]);
        }

        // display after fraction oBefFract
        if (stringAsk.indexOf(".") > -1) {
            System.out.print(".");
            String[] oBefFract3 = oBefFract_afterFraction.split("");
            for (int i = 0; i < oBefFract3.length; i++) {
                System.out.print(oBefFract3[i]);
            }
        }

    }
}