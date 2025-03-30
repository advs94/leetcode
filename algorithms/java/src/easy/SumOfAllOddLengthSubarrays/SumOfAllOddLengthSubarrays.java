package easy;

public class SumOfAllOddLengthSubarrays {
    /*
     * LC - 1588. Sum of All Odd Length Subarrays
     */
    public int sumOddLengthSubarrays(int[] arr) {
        final int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i + 1, right = n - i;
            int numSubArrays = left * right;
            int numOddSubArrays = (numSubArrays & 1) == 0 ? numSubArrays / 2 : numSubArrays / 2 + 1;
            sum += arr[i] * numOddSubArrays;
        }
        return sum;
    }
}
