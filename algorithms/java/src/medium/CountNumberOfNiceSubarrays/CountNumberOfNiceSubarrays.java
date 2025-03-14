package medium;

public class CountNumberOfNiceSubarrays {
    /*
     * LC - 1248. Count Number of Nice Subarrays
     */
    public int numberOfSubarrays(int[] nums, int k) {
        final Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0,1);
        int preSum = 0, count = 0;
        for (int num : nums) {
            preSum += (num & 1);
            count += freq.getOrDefault(preSum-k, 0);
            freq.merge(preSum, 1, Integer::sum);
        }
        return count;
    }
}
