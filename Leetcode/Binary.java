package Leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary {
    public static int Bitcount(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int decitobinary(int d) {
        if (d == 0) {
            return 0;
        }
        return (d % 2) + 10 * decitobinary(d / 2);
    }

    public static ArrayList printlist(int n, int m) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            l.add(decitobinary(i));
        }
        return l;
    }

    public static int count(int n) {
        String c = String.valueOf(n);
        int f = 0;
        int a = c.length();
        for (int i = 0; i < a; i++) {
            if (c.charAt(i) == '1') {
                f++;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(Bitcount(n));

            int a = decitobinary(n);
            System.out.println(count(a));
            System.out.println(decitobinary(n));
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(printlist(n, m));
        }
    }
}
