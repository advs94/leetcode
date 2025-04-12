package easy;

public class SortArrayByParity {
    /*
     * LC - 905. Sort Array By Parity
     */
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if ((nums[j] & 1) == 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }
}
