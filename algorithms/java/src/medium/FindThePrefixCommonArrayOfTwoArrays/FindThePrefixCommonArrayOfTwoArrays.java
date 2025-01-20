package medium;

public class FindThePrefixCommonArrayOfTwoArrays {
    /*
     * LC - 2657. Find the Prefix Common Array of Two Arrays
     */
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[n + 1];
        int[] ans = new int[n];
        int common = 0;
        for (int i = 0; i < n; i++) {
            if (++freq[A[i]] == 2) common++; // Increment freq for A[i] and check if it appears in both arrays
            if (++freq[B[i]] == 2) common++; // Increment freq for B[i] and check if it appears in both arrays
            ans[i] = common; // Store the current common count
        }
        return ans; // Return the array of common prefix counts
    }
}
