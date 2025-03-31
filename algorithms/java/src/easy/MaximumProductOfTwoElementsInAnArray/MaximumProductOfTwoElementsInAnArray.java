package easy;

public class MaximumProductOfTwoElementsInAnArray {
    /*
     * LC - 1464. Maximum Product of Two Elements in an Array
     */
    public int maxProduct(int[] nums) {
        int i = Integer.MIN_VALUE, j = Integer.MIN_VALUE;
        for (int num : nums) {
            if (j < num) {
                if (i < j) {
                    i = j;
                }
                j = num;
            } else if (i < num) {
                i = num;
            }
        }
        return (i-1)*(j-1);
    }
}
