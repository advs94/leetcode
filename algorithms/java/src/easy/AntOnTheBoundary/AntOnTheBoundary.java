package easy;

public class AntOnTheBoundary {
    /*
     * LC - 3028. Ant on the Boundary
     */
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
            if (nums[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
