package easy;

public class FindNUniqueIntegersSumUpToZero {
    /*
     * LC - 1304. Find N Unique Integers Sum up to Zero
     */
    public int[] sumZero(int n) {
        final int[] arr = new int[n];
        for (int i = 1, j = 0; i <= n/2; i++) {
            arr[j++] = i;
            arr[j++] = -i;
        }
        return arr;
    }
}
