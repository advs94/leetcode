package easy;

public class CountEqualAndDivisiblePairsInAnArray {
    /*
     * LC - 2176. Count Equal and Divisible Pairs in an Array
     */
    public int countPairs(int[] nums, int k) {
        final int n = nums.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
