package Recursion;

public class Factorial {
    public static int Fact(int n) {
        if (n == 0) {

            return 1;
        }
        // int Fact = Fact(n - 1);
        int fn = n * Fact(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(Fact(n));

    }
}
