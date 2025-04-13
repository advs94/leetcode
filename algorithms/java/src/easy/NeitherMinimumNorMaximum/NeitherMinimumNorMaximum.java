package easy;

public class NeitherMinimumNorMaximum {
    /*
     * LC - 2733. Neither Minimum nor Maximum
     */
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if (nums[0] > nums[1]) {
            max = nums[0];
            min = nums[1];
        } else {
            max = nums[1];
            min = nums[0];
        }
        if (max < nums[2]) return max;
        if (min > nums[2]) return min;
        return nums[2];
    }
}
