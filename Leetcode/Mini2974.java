package Leetcode;

import java.util.Arrays;

public class Mini2974 {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];

            }
        }
        int arr[] = new int[nums.length];
        arr[0] = min;
        return arr;

    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 2, 3 };
        numberGame(nums);
        System.out.println(numberGame(nums));
    }
}
