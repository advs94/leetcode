package easy;

public class MaximumAscendingSubarraySum {
    /*
     * LC - 1800. Maximum Ascending Subarray Sum
     */
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int tempSum = sum;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                tempSum += nums[i];
                if (tempSum > sum) {
                    sum = tempSum;
                }
            } else {
                tempSum = nums[i];
            }
        }
        return sum;
    }
}
