package Codingninjas;

public class CheckSortedArray {

    public static int ans(int n, int[] a) {
        int min = Integer.MAX_VALUE;
        int p = 0;
        int q = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (min > a[i]) {
                min = a[i];

            }
            if (max < a[i]) {
                max = a[i];
            }
            // p = min;
            // q = max;
            // int j = p + 1;
            // if (j == p) {
            // return true;
            // }
            // if (a[i] < a[i + 1]) {
            // return true;
            // }
            // }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(ans(5, arr));
    }
}
