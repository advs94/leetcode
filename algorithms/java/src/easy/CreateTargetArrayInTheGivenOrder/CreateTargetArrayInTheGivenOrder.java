package easy;

public class CreateTargetArrayInTheGivenOrder {
    /*
     * LC - 1389. Create Target Array in the Given Order
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        final int n = nums.length;
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            if (index[i] != i) System.arraycopy(nums, index[i], nums, index[i]+1, i-index[i]);
            nums[index[i]] = temp;
        }
        return nums;
    }
}
