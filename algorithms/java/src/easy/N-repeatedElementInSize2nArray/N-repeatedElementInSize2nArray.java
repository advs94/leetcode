package easy;

public class N-repeatedElementInSize2nArray {
    /*
     * LC - 961. N-Repeated Element in Size 2N Array
     */
    public int repeatedNTimes(int[] nums) {
        final boolean[] freq = new boolean[10001];
        for (int num : nums) {
            if (freq[num]) return num;
            freq[num] = true;
        }
        return -1;
    }
}
