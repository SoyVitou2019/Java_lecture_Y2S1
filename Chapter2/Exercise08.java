import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary : ");
        String bin = input.next();
        String afterDeci = "";
        String beforeDeci = "";
        double sum = 0;
        String[] arrayBin;
        String[] arrayAfterBin;
        int indexOfPoint = bin.indexOf(".");
        // check if bin has floating binary or not
        if (indexOfPoint > -1) {
            afterDeci = bin.substring(indexOfPoint + 1, bin.length());
            arrayAfterBin = afterDeci.split("");
            beforeDeci = bin.substring(0, indexOfPoint);
            arrayBin = beforeDeci.split("");
            // convert binary after floating points to decimal number.
            for (int i = 0; i < arrayAfterBin.length; i++) {
                sum += Integer.parseInt(arrayAfterBin[i]) * Math.pow(2, (i + 1) * (-1));
            }
            System.out.println(sum);
        } else {
            arrayBin = bin.split("");
        }
        // convert binary before floating points
        for (int i = 0; i < arrayBin.length; i++) {
            sum += Integer.parseInt(arrayBin[i]) * Math.pow(2, arrayBin.length - i - 1);
        }
        System.out.println(sum);
        input.close();
    }
}
