package SesstionBYVishal;

import java.util.Scanner;

public class box {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = -1;
        for (int i = 0; i <= 2 * n; i++) {
            for (int j = 0; j < n; j++) {
                if (f > 0)
                    System.out.print("##");
                else
                    System.out.print("..");

                f *= -1;
            }
            System.out.println();
            f *= -1;
            if (i % 2 == 0)
                f *= -1;
            if (n % 2 == 0)
                f *= -1;
        }
    }

}
