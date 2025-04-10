package easy;

public class FindNumbersWithEvenNumberOfDigits {
    /*
     * LC - 1295. Find Numbers with Even Number of Digits
     */
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int tmp = 0;
            while (num != 0) {
                num /= 10;
                tmp++;
            }
            if ((tmp & 1) == 0) {
                count++;
            }
        }
        return count;
    }
}
