import java.util.*;

public class Factorial {

    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int Binomial(int n, int r) {
        int x = n - r;
        int p = fact(n);
        int q = fact(r);
        int y = fact(x);
        int ansb = p / (q * y);
        return ansb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for Factorial:");
        int a = sc.nextInt();
        int ans = fact(a);
        System.out.println(ans);

        // Binomial Coefficient
        System.out.println("enter number for Binomial Coefficient:n & r:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ansb = Binomial(n, r);

        System.out.println("Binomial Coefficient ans:" + ansb);

    }

}
