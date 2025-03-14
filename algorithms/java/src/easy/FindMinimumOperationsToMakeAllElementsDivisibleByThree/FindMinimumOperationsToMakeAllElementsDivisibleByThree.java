package easy;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    /*
     * LC - 3190. Find Minimum Operations to Make All Elements Divisible by Three
     */
    public int minimumOperations(int[] nums) {
        int min = 0;
        for (int num : nums) if (num % 3 != 0) min++;
        return min;
    }
}
