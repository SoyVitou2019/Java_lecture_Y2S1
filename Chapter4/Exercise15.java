// Pattern recognition: Method isConsecutiveFour
class Exercise15 {
    public static void main(String[] args) {
        int[][] array2D = {
                { 0, 1, 0, 5, 1, 6, 1 },
                { 4, 1, 3, 8, 5, 7, 1 },
                { 0, 1, 3, 8, 5, 7, 1 },
                { 5, 0, 8, 3, 7, 1, 7 },
                { 5, 5, 2, 4, 4, 2, 7 },
                { 5, 3, 7, 0, 3, 3, 1 },
                { 5, 3, 1, 3, 3, 0, 7 } };

        // Display Result
        if (isConsecutiveFour(array2D) == true) {
            System.out.println("ConsecutiveFour");
        } else if (isConsecutiveFour(array2D) == false) {
            System.out.println("Non-ConsecutiveFour");
        }
    }

    public static boolean isConsecutiveFour(int[][] array2D) {
        boolean checkpoint = false;
        // check down of top
        for (int i = 0; i < array2D.length - 3; i++) {
            int i1 = 0, i2 = 1;
            int j1 = array2D[0].length - i - 4, j2 = array2D[0].length - i - 3;
            int count_dd = 1;
            for (int j = 0; j < array2D[0].length - 4 + i; j++) {
                if (array2D[i1][j1] == array2D[i2][j2]) {
                    count_dd++;
                    i2++;
                    j2++;
                    if (count_dd >= 4) {
                        checkpoint = true;
                    }
                } else {
                    count_dd = 1;
                    i1 = i2;
                    j1 = j2;
                    i2++;
                    j2++;
                }

            }

        }
        // check down of button
        for (int i = 0; i < array2D.length - 3; i++) {
            int i1 = i + 1, i2 = 2 + i;
            int j1 = 0, j2 = 1;
            int count_dd = 1;
            for (int j = 0; j < array2D.length - 2 - i; j++) {
                if (array2D[i1][j1] == array2D[i2][j2]) {
                    count_dd++;
                    i2++;
                    j2++;
                    if (count_dd >= 4) {
                        checkpoint = true;
                    }
                } else {
                    count_dd = 1;
                    i1 = i2;
                    j1 = j2;
                    i2++;
                    j2++;
                }

            }

        }
        // check up top
        for (int i = 0; i < array2D.length; i++) {
            int m = i;
            int count_d = 1;
            for (int j = 1; j <= i; j++) {
                int j1 = 0;
                int j2 = 1;
                for (int k = i - 1; k >= 0; k--) {
                    if (array2D[m][j1] == array2D[k][j2]) {
                        count_d++;
                    } else {
                        m--;
                        j1++;
                        break;
                    }
                    j2++;
                }
            }
            if (count_d >= 4) {
                checkpoint = true;
            }
        }
        // check up half of top
        for (int i = 0; i < array2D.length; i++) {
            int count_d2 = 1;
            int i1 = array2D.length - 1, i2 = array2D.length - 2;
            int j1 = i + 1, j2 = i + 2;
            int j = 1;
            for (j = i + 1; j < array2D[0].length - 1; j++) {
                if (array2D[i1][j1] == array2D[i2][j2]) {
                    i2--;
                    j2++;
                    count_d2++;
                } else {
                    i1--;
                    j1++;
                    i2--;
                    j2++;
                }
            }
            if (count_d2 >= 4) {
                checkpoint = true;
            }

        }
        // check row and count
        for (int i = 0; i < array2D[0].length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                int count_row = 1;
                for (int k = j + 1; k < array2D.length; k++) {
                    if (array2D[j][i] == array2D[k][i]) {
                        count_row++;
                    } else {
                        break;
                    }
                }
                if (count_row >= 4) {
                    checkpoint = true;
                }
            }
        }
        // check column
        for (int i = 0; i < array2D.length; i++) {
            for (int index = 0; index < array2D[i].length; index++) {
                int count_column = 1;

                for (int index1 = index + 1; index1 < array2D[0].length; index1++) {
                    if (array2D[i][index] == array2D[i][index1]) {
                        count_column++;
                    } else {
                        break;
                    }

                }
                if (count_column >= 4) {
                    checkpoint = true;
                }

            }
        }
        return checkpoint;
    }
}