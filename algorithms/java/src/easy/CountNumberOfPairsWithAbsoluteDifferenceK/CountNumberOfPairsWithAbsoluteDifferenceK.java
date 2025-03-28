package easy;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    /*
     * LC - 2006. Count Number of Pairs With Absolute Difference K
     */
    public int countKDifference(int[] nums, int k) {
        final int[] arr = new int[101];
        for (int num : nums) arr[num]++;
        int count = 0;
        for (int i = k+1; i < 101; i++) count += arr[i-k] * arr[i];
        return count;
    }
}
