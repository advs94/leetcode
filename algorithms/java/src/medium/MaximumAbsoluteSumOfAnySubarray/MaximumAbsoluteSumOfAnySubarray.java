package medium;

public class MaximumAbsoluteSumOfAnySubarray {
    /*
     * LC - 1749. Maximum Absolute Sum of Any Subarray
     */
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int minPrefix = 0;
        int maxPrefix = 0;
        for (int num : nums) {
            sum += num;
            maxPrefix = Math.max(maxPrefix, sum);
            minPrefix = Math.min(minPrefix, sum);
        }
        return maxPrefix - minPrefix;
    }
}
