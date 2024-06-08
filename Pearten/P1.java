package Pearten;

import java.util.Scanner;

public class P1 {
    public static void Squer(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // public static void Traingle(int r ,int c) {
    // for (int i = 0; i < r; i++) {
    // for (int j = ; j < 2 * n + 1; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    public static void oneTon(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void nTon(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print(i);
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nToone(int n) {
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void oneToodd(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                // System.out.print(j);
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void oneToeven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                // System.out.print(j);
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void notoddn(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void www(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("*");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            s += 2;
            System.out.println();
        }
    }

    public static void hmmm(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                if (j == n) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void num(int n) {
        for (int i = 1; i <= n; i++) {
            int c = 5;
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.print(j);
                } else if (j == 2) {

                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        int v = n;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                if (j == n - i + 1) {
                    System.out.print("*");
                }
            }
            for (int j = 1; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                if (j == n) {
                    continue;
                }
                if (j == n - i + 1) {
                    System.out.print("*");
                }
            }
            s = s + 2;
            System.out.println();
        }
        int si = 2 * n - 2;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("*");
                }
            }
            for (int j = 1; j < si - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == n - 1) {
                    continue;
                }
                if (j == i) {
                    System.out.print("*");
                }

            }

            si = si - 2;
            System.out.println();
        }
    }

    public static void hard(int n) {
        // int s = 0, d = n;
        // int p = 0, x = n;
        // int a = 0, b = n;
        // int e = 0, f = n;
        // int g = 0, h = n;
        // int k = 0, l = n;
        // int m = 0, q = n;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1) {
        // System.out.print(j + s + " ");
        // s = s + d;
        // d--;
        // } else if (j == 2) {
        // System.out.print(j + p + " ");
        // p = p + x;
        // x--;
        // } else if (j == 3) {
        // System.out.print(j + a + " ");
        // a = a + b;
        // b--;
        // } else if (j == 4) {
        // System.out.print(j + e + " ");
        // e = e + f;
        // f--;
        // } else if (j == 5) {
        // System.out.print(j + g + " ");
        // g = g + h;
        // h--;
        // } else if (j == 6) {
        // System.out.print(j + k + " ");
        // k = k + l;
        // l--;
        // } else if (j == 7) {
        // System.out.print(j + m + " ");
        // m = m + q;
        // q--;
        // }

        // }
        // // s = s + d;
        // // // p = p + x;
        // // // x = x + d;
        // // d--;

        // // x--;
        // System.out.println();
        // }
        int[] s = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = 0;
            d[i] = n - i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + s[j - 1] + " ");
                s[j - 1] += d[j - 1];
                d[j - 1]--;
            }
            System.out.println();
        }
    }

    public static void magaj(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(s);
                s = s + 1;
            }

            System.out.println();
        }
    }

    public static void man(int n) {
        int a = n;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(n - i + j);
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void daim(int n) {
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print("+");
        // }
        // for (int j = n; j >= n; j--) {
        // System.out.print("*");
        // }
        // for (int j = 1; j < i; j++) {
        // System.out.print("+");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= n; j--) {
                System.out.print("*");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= n; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void doubletringle(int n) {
        int a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                // System.out.print("* ");
                System.out.print(a + " ");

            }
            a--;
            System.out.println();
        }
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // System.out.print("* ");
                System.out.print(b + " ");
            }
            b++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            // Squer(n);
            // // Traingle(n);//baki
            // oneTon(n);
            // nTon(n);
            // nToone(n);
            // oneToodd(n);
            // oneToeven(n);
            // notoddn(n);
            // www(n);
            // hmmm(n);
            // star(n);
            // // num(n);baki
            // diamond(n);
            // hard(n);
            // magaj(n);
            // man(n);
            // daim(n);
            doubletringle(n);
        }
    }
}
