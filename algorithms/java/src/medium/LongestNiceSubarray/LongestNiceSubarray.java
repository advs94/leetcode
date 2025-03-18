package medium;

public class LongestNiceSubarray {
    /*
     * LC - 2401. Longest Nice Subarray
     */
    public int longestNiceSubarray(int[] nums) {
        final int n = nums.length;
        int left = 0, cur = 0, longest = 1;
        for (int right = 0; right < n; right++) {
            while ((cur & nums[right]) != 0) cur ^= nums[left++];
            cur |= nums[right];
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
}
