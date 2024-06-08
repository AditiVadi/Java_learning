package Leetcode;

import java.util.Arrays;

public class findNonMinOrMax2733 {
    public static int ans(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return -1;
        }
        int c = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int min = nums[0];
            int max = nums[nums.length - 1];
            if (nums[i] != min && nums[i] != max) {
                c = nums[i];
                break;
            }
        }
        return c;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4, 1 };
        System.out.println(ans(nums));
    }
}
