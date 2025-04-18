package easy;

public class ConstructTheMinimumBitwiseArrayI {
    /*
     * LC - 3314. Construct the Minimum Bitwise Array I
     */
    public int[] minBitwiseArray(List<Integer> nums) {
        final int[] ans = new int[nums.size()];
        int i = 0;
        for (int num : nums) {
            if (num == 2) ans[i++] = -1;
            else ans[i++] = num - ((num + 1) & (-num - 1)) / 2; 
        }
        return ans;
    }
}
