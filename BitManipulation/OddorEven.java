package BitManipulation;

import java.util.Scanner;

public class OddorEven {
    public static void and(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even num");
        } else {
            System.out.println("odd num");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        and(n);

    }
}
