package medium;

public class NumberOfSub-arraysWithOddSum {
    /*
     * LC - 1524. Number of Sub-arrays With Odd Sum
     */
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int odd = 0;
        int even = 1;
        int prefixSum = 0;
        int result = 0;
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 != 0) {
                result = (result + even) % MOD;
                odd++;
            } else {
                result = (result + odd) % MOD;
                even++;
            }
        }
        return result;
    }
}
