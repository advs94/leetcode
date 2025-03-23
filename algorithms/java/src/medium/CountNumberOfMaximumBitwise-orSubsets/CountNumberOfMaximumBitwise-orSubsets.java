package medium;

public class CountNumberOfMaximumBitwise-orSubsets {
    /*
     * LC - 2044. Count Number of Maximum Bitwise-OR Subsets
     */
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int num : nums) max |= num;
        return backtrack(nums, 0, 0, max, 0);
    }

    private int backtrack(int[] nums, int index, int cur, int max, int count) {
        if (cur == max) count++;
        for (int i = index; i < nums.length; i++) count = backtrack(nums, i+1, cur | nums[i], max, count);
        return count;
    }
}
