package easy;

public class LeftAndRightSumDifferences {
    /*
     * LC - 2574. Left and Right Sum Differences
     */
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        for (int num : nums) rightSum += num;
        final int n = nums.length;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            int tmp = nums[i];
            nums[i] = Math.abs(leftSum-rightSum);
            leftSum += tmp;
        }
        return nums;
    }
}
