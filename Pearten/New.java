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

    public static void p13(int n) {
        System.out.println("New Pearten p13:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j + i == n + 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p14(int n) {
        System.out.println("New Pearten p14:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print('A');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    public static void p15(int n) {
        System.out.println("New Pearten p15:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {// a->97 && A->64
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }
    }

    public static void p16(int n) {
        System.out.println("New Pearten p16:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j + i == n + 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            for (int j = 2; j <= n; j++) {
                if (i == j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }
    }

    public static void p17(int n) {
        System.out.println("New Pearten p17:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (2 * n); j++) {
                if ((j + i == n) || (j - i == n) || (j == n && j % 2 == 0)) {
                    System.out.print('*');
                } else {
                    System.out.print('+');
                }
                System.out.println();
            }
        }
    }

    public static void p18(int n) {
        System.out.println("New Pearten p18:");
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                a = a + 1;
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else if (i % 2 != 0) {
                    System.out.print((char) (64 + a));
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void p19(int n) {
        System.out.println("New Pearten p19:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }

                } else {
                    if (j % 2 != 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void p20(int n) {
        System.out.println("New Pearten p20:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void p21(int n) {
        System.out.println("New Pearten p21:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void p22(int n) {
        System.out.println("New Pearten p22:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= n - i + 1; j++) {
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
            p13(n);
            p14(n);
            p15(n);
            p16(n);
            // p17(n);
            p18(n);
            p19(n);
            p20(n);
            p21(n);
            p22(n);
        }
    }
}
