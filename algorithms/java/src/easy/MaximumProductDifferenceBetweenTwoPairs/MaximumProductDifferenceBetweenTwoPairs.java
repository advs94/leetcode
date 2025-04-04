package easy;

public class MaximumProductDifferenceBetweenTwoPairs {
    /*
     * LC - 1913. Maximum Product Difference Between Two Pairs
     */
    public int maxProductDifference(int[] nums) {
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MAX_VALUE, d = Integer.MAX_VALUE;
        for (int num : nums) {
            if (a < num) {
                if (b < a) {
                    b = a;
                }
                a = num;
            } else if (b < num) {
                b = num;
            }
            if (c > num) {
                if (d > c) {
                    d = c;
                }
                c = num;
            } else if (d > num) {
                d = num;
            }
        }
        return a * b - c * d;
    }
}
