package Recursion;

public class SortedOrnot {
    public static boolean sort(int[] n, int i) {
        if (i == n.length - 1) {
            return true;
        }
        if (n[i] > n[i + 1]) {
            return false;
        }
        return sort(n, i + 1);

    }

    public static void main(String[] args) {
        int n[] = { 0, 2, 3, 4, 5, 8, 9 };
        System.out.println(sort(n, 0));
        // (n,starithing arr)
    }
}
