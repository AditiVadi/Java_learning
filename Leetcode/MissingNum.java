package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {
    public static int ans(int arr[]) {
        Arrays.sort(arr);
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 0, 3, 1 };

        System.out.println(ans(arr));

    }
}
