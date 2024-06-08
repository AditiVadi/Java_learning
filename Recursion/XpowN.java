package Recursion;

public class XpowN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1= power(x,n-1);
        // int xn= x*xnm1;
        // return xn;
        return x * power(x, n - 1);
    }

    public static int optimized(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halpower = optimized(a, n / 2);
        int sq = halpower * halpower;
        // n is odd
        if (n % 2 != 0) {
            sq = a * sq;
        }
        return sq;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optimized(2, 10));

    }
}
