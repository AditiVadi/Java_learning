package BackTracking;

public class Queen {// O(n!) T(n)=Queenplace * T(n-1) + isSafe()
    // public static void nQueen(char borad[][], int row) {
    // // base
    // if (row == borad.length) {
    // // printBorad(borad);
    // count++;
    // return;
    // }
    // // collumn loop
    // for (int j = 0; j < borad.length; j++) {
    // if (ifSafe(borad, row, j)) {
    // borad[row][j] = 'Q';
    // nQueen(borad, row + 1);// function call
    // borad[row][j] = 'X';// backtracking step
    // }

    // }
    // }
    public static boolean nQueen(char borad[][], int row) {
        // base
        if (row == borad.length) {
            // printBorad(borad);
            count++;
            return true;
        }
        // collumn loop
        for (int j = 0; j < borad.length; j++) {
            if (ifSafe(borad, row, j)) {
                borad[row][j] = 'Q';
                if (nQueen(borad, row + 1)) {
                    return true;
                } // function call
                borad[row][j] = 'X';// backtracking step
            }

        }
        return false;
    }

    public static boolean ifSafe(char borad[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (borad[i][col] == 'Q') {
                return false;
            }
        }
        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (borad[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < borad.length; i--, j++) {
            if (borad[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBorad(char borad[][]) {
        System.out.println("-------- chess borad ----------");
        for (int i = 0; i < borad.length; i++) {
            for (int j = 0; j < borad.length; j++) {
                System.out.print(borad[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char borad[][] = new char[n][n];
        // intitialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                borad[i][j] = 'X';
            }
        }
        // nQueen(borad, 0);
        if (nQueen(borad, 0)) {
            System.out.println("Solution is possible");
            printBorad(borad);
        } else {
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total ways:" + count);
    }
}
