package Leetcode;

import java.util.Arrays;

public class coutest {
    public static int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;

        int mf = 1;
        for (int i = 0; i < nums.length; i++) {
            int freq = 1;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                freq++;
                i++;
            }
            if (freq > mf) {
                mf = freq;
                count = 1;
            } else if (freq == mf) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        // int nums[] = { 1, 1, 2, 3, 5, 4 };
        // System.out.println(maxFrequencyElements(nums));
        int n = 18;
        int a = 18 / 10;
        System.out.println(a);
        int b = 18 % 10;
        System.out.println(b);
        int sum = a + b;
        System.out.println(sum);
        int d = n % sum;
        System.out.println(d);
        if (d == 0) {
            System.out.println(d);
        }

    }
}
