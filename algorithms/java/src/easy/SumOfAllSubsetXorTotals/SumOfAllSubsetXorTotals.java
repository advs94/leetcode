package easy;

public class SumOfAllSubsetXorTotals {
    /*
     * LC - 1863. Sum of All Subset XOR Totals
     */
    public int subsetXORSum(int[] nums) {
        final int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sum += backtrack (i, nums[i], nums);
        }
        return sum;
    }

    private int backtrack (int i, int xor, int[] nums) {
        final int n = nums.length;
        if (i == n) return 0;
        int sum = 0;
        for (int j = i+1; j < n; j++) {
            xor ^= nums[j];
            sum += xor;
            sum += backtrack(j, xor, nums);
            xor ^= nums[j];
        }
        return sum;
    }
}
