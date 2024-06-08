import java.util.*;

public class TwoDArray {

    public static void big(int arr[][]) {
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > big) {
                    big = arr[i][j];
                }

            }
        }
        System.out.println("Bigest element=" + big);
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        big(arr);
    }
}
