package medium;

public class CountTotalNumberOfColoredCells {
    /*
     * LC - 2579. Count Total Number of Colored Cells
     */
    public long coloredCells(int n) {
        return 2L * n * n - 2 * n + 1;
    }

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
