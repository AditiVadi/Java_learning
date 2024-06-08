package Pearten;

import java.util.Scanner;

public class New {

    public static void p1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p2(int n) {
        System.out.println("New Pearten");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void p3(int n) {
        System.out.println("New Pearten");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p4(int n) {
        System.out.println("New Pearten");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p5(int n) {
        System.out.println("New Pearten");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p6(int n) {
        System.out.println("New Pearten");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers of Peartens");
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            p1(n);
            p2(n);
            p3(n);
            p4(n);
            p5(n);
            p6(n);
        }
    }
}
