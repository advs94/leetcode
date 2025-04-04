package easy;

public class SeparateTheDigitsInAnArray {
    /*
     * LC - 2553. Separate the Digits in an Array
     */
    public int[] separateDigits(int[] nums) {
        int n = 0;
        for (int num : nums) n += (int) (Math.log10(num) + 1);
        final int[] res = new int[n];
        int i = 0;
        for (int num : nums) {
            int digits = (int) (Math.log10(num) + 1);
            int j = i + digits - 1;
            while (num != 0) {
                res[j--] = num%10;
                num /= 10;
            }
            i += digits;
        }
        return res;
    }
}
