package easy;

public class MakeArrayZeroBySubtractingEqualAmounts {
    /*
     * LC - 2357. Make Array Zero by Subtracting Equal Amounts
     */
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int min = 0, sub = 0;
        for (int num : nums) {
            if (num != 0 && num - sub > 0) {
                sub += num - sub;
                min++;
            }
        }
        return min;
    }
}
