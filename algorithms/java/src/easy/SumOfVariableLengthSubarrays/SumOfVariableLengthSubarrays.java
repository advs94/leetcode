package easy;

public class SumOfVariableLengthSubarrays {
    /*
     * LC - 3427. Sum of Variable Length Subarrays
     */
    public int subarraySum(int[] nums) {
        final int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = Math.max(0, i-nums[i]); j <= i; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }
}
