import java.util.Scanner;

public class SpiralMatrix {
    public static void Spiral(int arr[][]) {
        int startrow = 0;
        int endrow = arr.length - 1;
        int startcoll = 0;
        int endcoll = arr[0].length - 1;

        while (startrow <= endrow && startcoll <= endcoll) {
            // top
            for (int j = startcoll; j <= endcoll; j++) {
                System.out.print(arr[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcoll] + " ");
            }

            // bottom
            for (int j = endcoll - 1; j >= startcoll; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcoll == endcoll) {
                    break;
                }
                System.out.print(arr[i][startcoll] + " ");
            }
            startcoll++;
            startrow++;
            endcoll--;
            endrow--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        Spiral(arr);
    }
}
