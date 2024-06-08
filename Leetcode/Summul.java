package Leetcode;

import java.util.Scanner;

public class Summul {
    public static void summul(int n, int q) {
        int sum = 0;
        int mul = 0;
        if (q == 1) {
            sum = n * (n + 1) / 2;
        } else {
            mul = Fact(n);
        }
        // int num[] = new int[2];
        // num[0] = sum;
        // num[1] = mul;
        // return new int[]{sum,mul};
        System.out.println(sum + " " + mul);
    }

    public static int Fact(int n) {
        if (n == 0) {

            return 1;
        }
        // int Fact = Fact(n - 1);
        // int fn = n * Fact(n - 1);
        return n * Fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            summul(n, q);
        }
    }
}
