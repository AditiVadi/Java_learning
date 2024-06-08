package Leetcode;

import java.util.Arrays;

public class Logest128 {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                return 1;
            } else if (nums[i] <= i + 1 || nums[i] <= i) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0 };
        // 0,0,1,2,3,4,5,6,7,8
        System.out.println(longestConsecutive(nums));
    }
}
