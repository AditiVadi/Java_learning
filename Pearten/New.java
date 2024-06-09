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

    public static void p7(int n) {
        System.out.println("New Pearten p7:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p8(int n) {
        System.out.println("New Pearten p8:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p9(int n) {
        System.out.println("New Pearten p9:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p10(int n) {
        System.out.println("New Pearten p10:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p11(int n) {
        System.out.println("New Pearten p11:");
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 1; i--) {

            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p12(int n) {
        System.out.println("New Pearten p12:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
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
            p7(n);
            p8(n);
            p9(n);
            p10(n);
            p11(n);
            p12(n);
        }
    }
}
