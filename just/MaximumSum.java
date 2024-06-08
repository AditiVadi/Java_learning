package just;

import java.util.Scanner;

public class MaximumSum {
    public static void sum(int arr[], int n) {
        int sum = 0, count = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            } else {
                if (arr[i] > max || max == 0) {
                    max = arr[i];
                }
            }
        }
        if (sum == 0) {
            sum = max;
            count = 1;
        }
        // return new int[] { sum, count };
        System.out.println(sum + " " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        while (t-- > 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sum(arr, n);
        }
    }
}
