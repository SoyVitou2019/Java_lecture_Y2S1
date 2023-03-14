// Compute the weekly hours for each employee
public class Exercise8 {
    public static void main(String[] args) {

        // Declare 3D array with first element is employee's id
        // And second is array of employee's hour of working per day in a week
        int[][][] table = {
                { { 0 }, { 2, 4, 3, 4, 5, 8, 8 } },
                { { 1 }, { 7, 3, 4, 3, 3, 4, 4 } },
                { { 2 }, { 3, 3, 4, 3, 3, 2, 2 } },
                { { 3 }, { 9, 3, 4, 7, 3, 4, 1 } },
                { { 4 }, { 3, 5, 4, 3, 6, 3, 8 } },
                { { 5 }, { 3, 4, 4, 6, 3, 4, 4 } },
                { { 6 }, { 3, 7, 4, 8, 3, 8, 4 } },
                { { 7 }, { 6, 3, 5, 9, 2, 7, 9 } },
        };

        // Print out array in order of id before sort
        System.out.println("\nDisplay employees in order of total hours: \n");
        System.out.println("\t    Su  M   T   W   Th  F   Sa");

        for (int i = 0; i < table.length; i++) {

            System.out.print("Employee " + table[i][0][0] + ": "); // Employee 1: ~

            for (int j = 0; j < table[i][1].length; j++) {
                System.out.printf("%-3d ", table[i][1][j]); // 7 3 4 3 3 4 4
            }
            System.out.print("\n");
        }

        // Making insertion sort
        for (int i = 1; i < table.length; i++) {

            // Comparation start from second element
            for (int k = i; k > 0; k--) {

                int totalOfCurrentEmp = 0;
                int totalOfNextEmp = 0;

                // Making sum of current employee and its left working hour
                for (int j = 0; j < table[k][1].length; j++) {

                    totalOfCurrentEmp += table[k][1][j];
                    totalOfNextEmp += table[k - 1][1][j];
                }

                // Declare 2D array to store a temporary array for swapping
                int[][] temp = new int[0][0];

                // Make a swap for big to small sort
                if (totalOfCurrentEmp > totalOfNextEmp) {

                    temp = table[k];
                    table[k] = table[k - 1];
                    table[k - 1] = temp;
                }
            }

        }
        // Print out array after sort in order of decreasing working hour in a week
        System.out.println("\n\nDisplay employees in decreasing order of total hours: ");
        System.out.println("\n\t    Su  M   T   W   Th  F   Sa");

        for (int i = 0; i < table.length; i++) {

            System.out.print("Employee " + table[i][0][0] + ": "); // Employee 1: ~

            for (int j = 0; j < table[i][1].length; j++) {
                System.out.printf("%-3d ", table[i][1][j]); // 7 3 4 3 3 4 4
            }
            System.out.print("\n");
        }
    }
}
