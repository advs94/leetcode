package easy;

public class MinimumOperationsToExceedThresholdValueI {
    /*
     * LC - 3065. Minimum Operations to Exceed Threshold Value I
     */
    public int minOperations(int[] nums, int k) {
        int min = 0;
        for (int num : nums) if (num < k) min++;
        return min;
    }
}
