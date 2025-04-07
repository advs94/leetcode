package easy;

public class SumOfUniqueElements {
    /*
     * LC - 1748. Sum of Unique Elements
     */
    public int sumOfUnique(int[] nums) {
        final int[] freq = new int[101];
        for (int num : nums) freq[num]++;
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
