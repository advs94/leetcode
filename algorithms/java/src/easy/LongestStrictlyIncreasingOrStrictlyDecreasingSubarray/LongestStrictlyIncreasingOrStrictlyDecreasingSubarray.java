package easy;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    /*
     * LC - 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
     */
    public int longestMonotonicSubarray(int[] words) {
        int n = nums.length;
        int longest = 1;
        int increasing = 1;
        int decreasing = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] > nums[i]) {
                increasing = 1;
                if (++decreasing > longest) {
                    longest = decreasing;
                }
            } else if (nums[i-1] < nums[i]) {
                decreasing = 1;
                if (++increasing > longest) {
                    longest = increasing;
                }
            } else {
                increasing = 1;
                decreasing = 1;
            }
        }
        return longest;
    }
}
