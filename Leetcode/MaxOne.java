package Leetcode;

public class MaxOne {
    public static int ans(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == 1 && a[i + 1] == 1 && a[i - 1] == 1) {
                if (a[i] == 0)
                    break;
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 1, 1, 1 };
        System.out.println(ans(a));
    }
}
