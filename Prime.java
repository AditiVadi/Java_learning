import java.util.*;

public class Prime {

    public static boolean pri(int n) {
        // boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        // for (int i = 2; i < n - 1; i++)
        // optmised
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                // isPrime = false;
                // return isPrime;
                return false;
            }
        }
        // return isPrime;
        return true;
    }

    public static void Range(int n) {
        for (int i = 2; i <= n; i++) {
            if (pri(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(pri(n));
        System.out.println("range:");
        int r = sc.nextInt();
        Range(r);
    }
}
