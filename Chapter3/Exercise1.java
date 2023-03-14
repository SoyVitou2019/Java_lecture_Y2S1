// Class: ITE-Y2-G8-A
// Group06:
// 1.Choeng KhengSeang
// 2.Soy Vitou
// 3.Yoo Seryvathana
// 4.Lany Malis

// Generates a random 10-by-10 2D array of uppercase letters (A to Z)
public class Exercise1 {
    public static void main(String[] args) {
        char[][] charArray = new char[10][10];
        
        // Bound ASCII code from 'A' to 'Z'
        int lowerBound = 65;
        int upperBound = 90;

        // Random integer and convert it to char
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int randNum = (int) (Math.floor(Math.random() * 1e2)) % (upperBound - lowerBound + 1) + lowerBound;

                //Convert from int to char
                charArray[i][j] = String.valueOf((char) randNum).charAt(0);
                System.out.printf("%-3c", charArray[i][j]);

            }
            // Ten row nextline
            System.out.println("");
        }

    }
}
