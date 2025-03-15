package easy;

public class TransformArrayByParity {
    /*
     * LC - 3467. Transform Array by Parity
     */
    public int[] transformArray(int[] nums) {
        final int n = nums.length;
        final int[] arr = new int[n];
        int odd = n-1;
        for (int num : nums) if ((num & 1) == 1) arr[odd--] = 1;
        return arr;
    }
}
