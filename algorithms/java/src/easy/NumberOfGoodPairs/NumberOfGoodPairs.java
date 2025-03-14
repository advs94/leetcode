package easy;

public class NumberOfGoodPairs {
    /*
     * LC - 1512. Number of Good Pairs
     */
    public int numIdenticalPairs(int[] nums) {
        final int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count; 
    }
}
