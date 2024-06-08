package SesstionBYVishal;

import java.util.Scanner;

public class paper {
    public static void main(String[] args) {
        System.out.println("enter number of id");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrm = new int[n];
        for (int i = 0; i < n; i++) {
            arrm[i] = sc.nextInt();
        }
        int[] arrc = new int[n];
        int j = 1, count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (j == arrm[i]) {
                // arrm[i] = 0;
                break;
            }
            arrc[i] = count;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrc[i]);
        }
    }
}
