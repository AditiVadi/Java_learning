package Codingninjas;

public class Traffic {
    public static int ans(int n, int m, int[] v) {
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            if (v[i] == 1) {
                a = a + 1;
            }
            if (v[i] == 0) {
                b = b + 1;
            }
        }

        c = a + m;

        return c;

    }

    public static void main(String[] args) {
        int[] v = { 0, 1, 0, 0, 1, 0 };
        int[] s = { 0, 1, 1 };
        System.out.println(ans(6, 3, v));
        System.out.println(ans(3, 1, s));
    }
}
