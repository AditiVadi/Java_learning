package BackTracking;

//O(2^(n+m))
public class Gridways { // current
    public static int grid(int i, int j, int n, int m) {
        // base
        if (i == n - 1 && j == m - 1) {// last call
            return 1;
        } else if (i == n || j == n) {// boundray corss condistion
            return 0;
        }
        int w1 = grid(i + 1, j, n, m);
        int w2 = grid(i, j + 1, n, m);
        return w1 + w2;
    }

    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int permutation(int n, int m) {
        // O(n+m)
        int ans = 0;
        int N = fact(n - 1);
        int M = fact(m - 1);
        int a = fact((n - 1) + (m - 1));
        ans = a / (N * M);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(grid(0, 0, n, m));
        System.out.println(permutation(n, m));
    }
}
