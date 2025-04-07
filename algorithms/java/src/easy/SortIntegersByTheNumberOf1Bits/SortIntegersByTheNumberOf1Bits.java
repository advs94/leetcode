package easy;

public class SortIntegersByTheNumberOf1Bits {
    /*
     * LC - 1356. Sort Integers by The Number of 1 Bits
     */
    public int[] sortByBits(int[] arr) {
        final int n = arr.length;
        for (int i = 0; i < n; i++) arr[i] += Integer.bitCount(arr[i]) * 10001;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) arr[i] %= 10001;
        return arr;
    }
}
