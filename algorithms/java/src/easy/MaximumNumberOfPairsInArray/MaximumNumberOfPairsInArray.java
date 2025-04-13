package easy;

public class MaximumNumberOfPairsInArray {
    /*
     * LC - 2341. Maximum Number of Pairs in Array
     */
    public int[] numberOfPairs(int[] nums) {
        final int[] freq = new int[101];
        for (int num : nums) freq[num]++;
        final int[] pairs = new int[2];
        for (int i = 0; i < 101; i++) {
            pairs[0] += freq[i]/2;
            if ((freq[i] & 1) == 1) {
                pairs[1]++;
            }
        }
        return pairs;
    }
}
