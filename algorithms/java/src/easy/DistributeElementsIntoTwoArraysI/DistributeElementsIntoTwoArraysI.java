package easy;

public class DistributeElementsIntoTwoArraysI {
    /*
     * LC - 3069. Distribute Elements Into Two Arrays I
     */
    public int[] resultArray(int[] nums) {
        final int n = nums.length;
        final int[] arr = new int[n];
        int p1 = 0, p2 = 0;
        arr[0] = nums[1];
        for (int i = 2; i < n; i++) {
            if (nums[p1] > arr[p2]) {
                nums[++p1] = nums[i];
            } else {
                arr[++p2] = nums[i];
            }
        }
        for (int i = 0; i <= p2; i++) nums[++p1] = arr[i];
        return nums;
    }
}
