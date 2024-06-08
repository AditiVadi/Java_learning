package Pearten;

public class New {

    public static void star(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    continue;
                }
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= n - i; j--) {
                System.out.print(' ');
            }
            for (int j = n; j >= i; j--) {
                System.out.print('*');
            }
            for (int j = n; j >= i; j--) {
                if (i == j) {
                    continue;
                }
                System.out.print('*');
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        star(4);
    }
}
