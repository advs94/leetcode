package medium;

public class FirstCompletelyPaintedRowOrColumn {
    /*
     * LC - 2661. First Completely Painted Row or Column
     */
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m*n+1];
        int[] col = new int[m*n+1];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                row[mat[r][c]] = r;
                col[mat[r][c]] = c;
            }
        }
        int[] rowFreq = new int[m];
        int[] colFreq = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (++rowFreq[row[arr[i]]] == n) return i;
            if (++colFreq[col[arr[i]]] == m) return i;
        }
        return arr.length - 1;
    }
}
