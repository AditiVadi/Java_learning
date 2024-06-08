package Recursion;

public class FristnNatural {

    public static int sum(int n) {
        int s;
        if (n == 1) {

            return n;
        }
        s = n + sum(n - 1);
        return s;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));

    }
}
