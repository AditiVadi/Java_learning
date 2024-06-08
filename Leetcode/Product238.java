package Leetcode;

public class Product238 {
    public static int productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans;
        for (int i = 0; i <= n; i++) {
            if (nums[i] != i) {
                ans = nums[i] * nums[i + 1];
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(productExceptSelf(nums));
    }
}
