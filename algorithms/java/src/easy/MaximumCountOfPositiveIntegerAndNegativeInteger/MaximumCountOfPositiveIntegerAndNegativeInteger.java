package easy;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    /*
     * LC - 2529. Maximum Count of Positive Integer and Negative Integer
     */
    public int maximumCount(int[] nums) {
        final int n = nums.length;
        int pos = 0, neg = 0;
        for (int i = 0; i < n/2; i++) {
            if (nums[i] < 0) neg++;
            else if (nums[i] > 0) pos++;
            if (nums[n-i-1] < 0) neg++;
            else if (nums[n-i-1] > 0) pos++;
        }
        if (n % 2 != 0) {
            if (nums[n/2] < 0) neg++;
            else if (nums[n/2] > 0) pos++;
        }
        return Math.max(pos, neg);
    }
}
