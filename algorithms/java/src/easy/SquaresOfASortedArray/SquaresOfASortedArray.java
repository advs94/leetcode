package easy;

public class SquaresOfASortedArray {
    /*
     * LC - 977. Squares of a Sorted Array
     */
    public int[] sortedSquares(int[] nums) {
        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] *= nums[i];
            }
        } else {
            int min = 0, max = nums.length - 1;
            final int[] ans = new int[nums.length];
            for (int i = nums.length - 1; i >= 0; i--) {
                if (Math.abs(nums[min]) < Math.abs(nums[max])) {
                    ans[i] = nums[max] * nums[max--];
                } else {
                    ans[i] = nums[min] * nums[min++];
                }
            }
            return ans;
        }
        return nums;
    }
}
