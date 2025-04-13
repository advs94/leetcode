package easy;

public class MakeTwoArraysEqualByReversingSubarrays {
    /*
     * LC - 1460. Make Two Arrays Equal by Reversing Subarrays
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        final int[] freq = new int[1001];
        final int n = arr.length;
        for (int i = 0; i < n; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        for (int i = 1; i < 1001; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
