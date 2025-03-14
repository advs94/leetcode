package easy;

public class MaximumStrongPairXorI {
    /*
     * LC - 2932. Maximum Strong Pair XOR I
     */
    public int maximumStrongPairXor(int[] nums) {
        final int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])) {
                    max = Math.max(max, nums[i]^nums[j]);
                }
            }
        }
        return max;
    }
}
