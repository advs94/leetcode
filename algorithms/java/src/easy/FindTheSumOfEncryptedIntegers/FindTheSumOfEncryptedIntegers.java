package easy;

public class FindTheSumOfEncryptedIntegers {
    /*
     * LC - 3079. Find the Sum of Encrypted Integers
     */
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += encrypt(num);
        return sum;
    }

    private int encrypt(int num) {
        int max = 0, count = 0;
        while (num != 0) {
            max = Math.max(max, num % 10);
            num /= 10;
            count++;
        }
        num = max;
        while (--count != 0) {
            num *= 10;
            num += max;
        }
        return num;
    }
}
