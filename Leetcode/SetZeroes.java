package Leetcode;

public class SetZeroes {
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println();
    }

    public static void setzeroes(int[][] m) {
        boolean fristRow = false, fristCol = false;

        // set markers in frist row and frist colum
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    if (i == 0)
                        fristRow = true;
                    if (j == 0)
                        fristCol = true;
                    m[0][j] = 0;
                    m[i][0] = 0;
                }
            }
        }
        // Replace inner matrix
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[0].length; j++) {
                if (m[i][0] == 0 || m[0][j] == 0) {
                    m[i][j] = 0;
                }
            }
        }

        // last remaining checks
        if (fristRow) {
            for (int j = 0; j < m[0].length; j++) {
                m[0][j] = 0;
            }
        }

        if (fristCol) {
            for (int i = 0; i < m.length; i++) {
                m[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int m[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setzeroes(m);
        print(m);
    }
}
