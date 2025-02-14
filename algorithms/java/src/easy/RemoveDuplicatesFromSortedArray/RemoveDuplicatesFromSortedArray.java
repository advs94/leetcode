package easy;

public class RemoveDuplicatesFromSortedArray {
    /*
     * LC - 26. Remove Duplicates from Sorted Array
     */
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
