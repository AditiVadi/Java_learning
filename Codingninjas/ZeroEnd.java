package Codingninjas;

public class ZeroEnd {
    public static int[] ans(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j--) {
                if (a[i] == 0) {
                    a[j] = a[i];
                }

            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 0, 0, 0, 4 };
        System.out.println(ans(6, a));
    }
}
