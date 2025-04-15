package easy;

public class TransposeMatrix {
    /*
     * LC - 867. Transpose Matrix
     */
    public int[][] transpose(int[][] matrix) {
        final int m = matrix.length, n = matrix[0].length;
        final int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
