package easy;

public class LargestLocalValuesInAMatrix {
    /*
     * LC - 2373. Largest Local Values in a Matrix
     */
    public int[][] largestLocal(int[][] grid) {
        final int n = grid.length;
        final int[][] largestLocal = new int[n-2][n-2];
        for (int x = 0; x < n-2; x++) {
            for (int y = 0; y < n-2; y++) {
                int max = 1;
                for (int i = x; i < x+3; i++) {
                    for (int j = y; j < y+3; j++) {
                        max = Math.max(max, grid[i][j]);
                    }
                }
                largestLocal[x][y] = max;
            }
        }
        return largestLocal;
    }
}
