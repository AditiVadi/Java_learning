package Recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int fb1 = fib(n - 1);
        // int fb2 = fib(n - 2);
        // int fb = fb1 + fb2;
        // return fb;
        return (fib(n - 1) + fib(n - 2));

    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}
