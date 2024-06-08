import java.util.*;

public class LargestNum {

    public static void Large(int num[]) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            } else if (num[i] < small) {
                small = num[i];
            }
        }
        System.out.println("Large number:" + large);
        System.out.println("Small number:" + small);

    }

    public static void main(String[] args) {
        int num[] = { 12, 34, 45, 66, 1224, 12, 0 };
        Large(num);
        // System.out.println("LargestNumber is:" + Large(num));
        // System.out.println("small" + Large(num));
    }
}
