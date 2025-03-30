package easy;

public class MinimumElementAfterReplacementWithDigitSum {
    /*
     * LC - 3300. Minimum Element After Replacement With Digit Sum
     */
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int candidate = 0;
            while (num != 0) {
                candidate += num % 10;
                num /= 10;
            }
            min = Math.min(min, candidate);
        }
        return min;
    }
}
