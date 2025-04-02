package easy;

public class SumOfSquaresOfSpecialElements {
    /*
     * LC - 2778. Sum of Squares of Special Elements
     */
    public int sumOfSquares(int[] nums) {
        final int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i+1) == 0) {
                sum += nums[i]*nums[i];
            }
        }
        return sum;
    }
}
