package HackerRank;

import java.util.*;

public class Dcc {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (sum == arr[i] + arr[i + 1]) {
                System.out.print(arr[i] + " " + arr[i + 1]);
            }
        }
    }

}
