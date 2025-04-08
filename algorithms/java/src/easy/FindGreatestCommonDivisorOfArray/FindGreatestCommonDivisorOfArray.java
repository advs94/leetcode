package easy;

public class FindGreatestCommonDivisorOfArray {
    /*
     * LC - 1979. Find Greatest Common Divisor of Array
     */
    public int findGCD(int[] nums) {
        int min = 1000, max = 1;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return euclidean(max, min);
    }

    private int euclidean (int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
