package easy;

public class MinimumOperationsToMakeTheArrayIncreasing {
    /*
     * LC - 1827. Minimum Operations to Make the Array Increasing
     */
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i-1] - nums[i] + 1;
            if (diff >= 1) {
                count += diff;
                nums[i] += diff;
            }
        }
        return count;
    }
}
