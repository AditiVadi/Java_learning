package Leetcode;

public class Prime762 {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int setBits = countSetBits(i);
            if (isPrime(setBits)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 15;
        System.out.println(countPrimeSetBits(left, right)); // Output should be 5
    }
}
