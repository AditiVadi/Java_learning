import java.sql.Time;

public class MaxSubarray {
    // Time Complecty=O(n^3)
    // BRUTE FORCE Basic solution
    public static void sub(int num[]) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                CurrSum = 0;
                for (int k = i; k <= j; k++) {

                    CurrSum += num[k];
                }
                System.out.println(CurrSum);
                if (maxSum < CurrSum) {
                    maxSum = CurrSum;
                }

            }

        }
        System.out.println("Max sum=" + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };

        sub(num);
    }
}
