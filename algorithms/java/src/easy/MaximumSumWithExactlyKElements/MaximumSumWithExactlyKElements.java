package easy;

public class MaximumSumWithExactlyKElements {
    /*
     * LC - 2656. Maximum Sum With Exactly K Elements
     */
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) max = Math.max(max, num);
        int res = 0;
        for (int i = 0; i < k; i++) res += max++;
        return res;
    }
}
