package easy;

public class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        int sumLeft = 0, sumRight = 0, count = 0;
        for (int num : nums) sumRight += num;
        for (int i = 0; i < nums.length - 1; i++) {
            sumRight -= nums[i];
            sumLeft += nums[i];
            if (((sumLeft - sumRight) & 1) == 0) {
                count++;
            }
        }
        return count;
    }
}
