package Codingninjas;

import java.util.Arrays;

public class SecondLargest {

    public static int[] ans(int[] a) {
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (min > a[i]) {
                min = i;

            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        int p = min + 1;
        int p1 = a[p];

        int[] arr = new int[2];
        arr[0] = max;
        arr[1] = p1;

        return arr;
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 5, 2 };
        System.out.println(ans(a));
    }

}
