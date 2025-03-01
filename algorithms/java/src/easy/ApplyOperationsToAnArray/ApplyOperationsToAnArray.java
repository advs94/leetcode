package easy;

public class ApplyOperationsToAnArray {
    /*
     * LC - 2460. Apply Operations to an Array
     */
    public int[] applyOperations(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i+1 != nums.length && nums[i] == nums[i+1]) {
                    nums[j++] = nums[i]*2;
                    nums[i+1] = 0;
                } else {
                    nums[j++] = nums[i];
                }
                if (j <= i) nums[i] = 0;
            }
        }
        return nums;
    }
}
