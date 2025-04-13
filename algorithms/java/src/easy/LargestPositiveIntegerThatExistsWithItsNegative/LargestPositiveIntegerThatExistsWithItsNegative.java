package easy;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    /*
     * LC - 2441. Largest Positive Integer That Exists With Its Negative
     */
    public int findMaxK(int[] nums) {
        final int[] freq = new int[1001];
        for (int num : nums) {
            int abs = Math.abs(num);
            if (num > 0 && freq[num] == -1) {
                freq[0] = Math.max(freq[0], num);
                freq[num] = -2;
            } else if (num < 0 && freq[abs] == 1) {
                freq[0] = Math.max(freq[0], abs);
                freq[abs] = 2;
            } else if (num > 0) {
                freq[num] = 1;
            } else {
                freq[abs] = -1;
            }
        }
        return freq[0] != 0 ? freq[0] : -1;
    }
}
