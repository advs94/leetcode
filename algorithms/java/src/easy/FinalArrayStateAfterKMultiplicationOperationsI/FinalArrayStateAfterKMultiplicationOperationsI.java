package easy;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    /*
     * LC - 3264. Final Array State After K Multiplication Operations I
     */
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        final int n = nums.length;
        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}
