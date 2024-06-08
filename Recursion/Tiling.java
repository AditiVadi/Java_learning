package Recursion;

public class Tiling {
    public static int tiling(int n) {// length of floor
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int ver = tiling(n - 1);

        // horizontal choice
        int hor = tiling(n - 2);
        int ways = ver + hor;
        return ways;

    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
