package easy;

public class MinimumOperationsToMakeArraySumDivisibleByK {
    /*
     * LC - 3512. Minimum Operations to Make Array Sum Divisible by K
     */
    public int minOperations(int[] nums, int k) {
        int sum = 0, i = 0, count = 0;
        for (int num : nums) sum += num;
        while (sum % k != 0) {
            if (nums[i] != 0) {
                nums[i]--;
                sum--;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}
