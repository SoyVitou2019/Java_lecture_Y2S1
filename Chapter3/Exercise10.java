
// Score 8 Students in 3 Subjects 
// Display divide in 2 groups
import java.util.Scanner;

public class Exercise10 {
    static String[] subject = { "Math", "Physics", "Chemistry" };

    // Method to print any array in tabular table
    static void printInTabular(int[][][] studentList, int groupNumber) {
        int totalEach = 0;
        int totalGroup = 0;

        System.out.println("\nGroup " + groupNumber + ": "); // Group 1:
        System.out.println("----------------------------------------------------------------------");
        // Print out each subject
        System.out.println("Name\t\t" + subject[0] + "\t\t" + subject[1] + "\t\t" + subject[2] + "\tTotal");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < studentList.length; i++) {
            System.out.printf("Student %d\t", studentList[i][0][0]); // Student name
            totalEach = 0;
            for (int j = 0; j < studentList[i][1].length; j++) {
                System.out.printf("%-16d", studentList[i][1][j]); // Student score for each subject
                totalEach += studentList[i][1][j]; // Sum those score
            }
            System.out.printf("%d\n", totalEach); // Print out total score of each student
            totalGroup += totalEach; // Sum of all student total score in each group
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\t\t   Total Score: %d", totalGroup); // Print out total of group score
    }

    public static void main(String[] args) {

        // To store student score for each group
        int[][][] group1 = new int[4][2][subject.length];
        int[][][] group2 = new int[4][2][subject.length];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 8 students score that will devide in 2 groups:");
        for (int i = 0; i < group1.length * 2; i++) {
            System.out.printf("\nStudent %d: \n", (i + 1)); // Student 1:

            if (i < 4) { // For first group
                group1[i][0][0] = i + 1; // Store each student number
                for (int j = 0; j < subject.length; j++) {
                    System.out.print(subject[j] + ": ");
                    group1[i][1][j] = input.nextInt();// Store each input subject score
                }
            } else { // For second group
                group2[i - 4][0][0] = i + 1; // Store each student number
                for (int j = 0; j < subject.length; j++) {
                    System.out.print(subject[j] + ": ");
                    group2[i - 4][1][j] = input.nextInt(); // Store each input subject score
                }
            }

        }

        input.close();

        // Print out students score of each group
        printInTabular(group1, 1);
        printInTabular(group2, 2);

    }
}
