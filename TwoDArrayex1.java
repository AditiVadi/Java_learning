import java.util.Scanner;

public class TwoDArrayex1 {
    // public static void ex1(int arr[][], int key) {
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // if (arr[i][j] == key) {
    // count++;
    // }
    // }
    // }
    // System.out.println("number of =" + key + " in array is=" + count);
    // }

    // public static void ex2(int arr[][]) {
    // int sum = 0;
    // // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // // if (arr[i][j] == arr[1][j])
    // sum += arr[1][j];

    // // }
    // }
    // System.out.println(sum);

    // }

    public static void ex3(int arr[][]) {

    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // ex1(arr, 7);

        // int arr[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // ex2(arr);

        int arr[][] = { { 1, 2, 3 }, { 1, 2, 3 } };
        int row = 2, col = 3;
        print(arr);
        int tran[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tran[j][i] = arr[i][j];
            }
        }

        print(tran);

    }
}
