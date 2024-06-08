public class PrefixArray {
    // Time Complecty=O(n^2)
    public static void sub(int num[]) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int Prefix[] = new int[num.length];

        // calculate prefix array
        Prefix[0] = num[0];
        for (int i = 1; i < Prefix.length; i++) {

            Prefix[i] = Prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                CurrSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start - 1];
                if (maxSum < CurrSum) {
                    maxSum = CurrSum;
                }

            }

        }
        System.out.println("Max sum=" + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        sub(num);
    }
}
