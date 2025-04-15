package easy;

public class MinimumOperationsToMakeArrayValuesEqualToK {
    /*
     * LC - 3375. Minimum Operations to Make Array Values Equal to K
     */
    public int minOperations(int[] nums, int k) {
        final int[] freq = new int[101];
        for (int num : nums) freq[num]++;
        for (int i = 1; i < k; i++) {
            if (freq[i] > 0) {
                return -1;
            }
        }
        int count = 0;
        for (int i = k + 1; i < 101; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
