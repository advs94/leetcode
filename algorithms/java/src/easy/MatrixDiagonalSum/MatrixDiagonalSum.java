package easy;

public class MatrixDiagonalSum {
    /*
     * LC - 1572. Matrix Diagonal Sum
     */
    public int diagonalSum(int[][] mat) {
        final int n = mat.length;
        int sum = (n & 1) == 1 ? mat[n/2][n/2] : 0;
        for (int i = 0; i < n/2; i++) sum += mat[i][i] + mat[i][n-i-1] + mat[n-i-1][i] + mat[n-i-1][n-i-1];
        return sum;
    }
}
