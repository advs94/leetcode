package easy;

public class DesignNeighborSumService {
    /*
     * LC - 3242. Design Neighbor Sum Service
     */
    class NeighborSum {
        private Map<Integer, int[]> neighborSum;

        public NeighborSum(int[][] grid) {
            final int n = grid.length;
            neighborSum = new HashMap<>(n*n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    final int[] sum = new int[2]; 
                    if (i != 0) sum[0] += grid[i-1][j];
                    if (i != n-1) sum[0] += grid[i+1][j];
                    if (j != 0) sum[0] += grid[i][j-1];
                    if (j != n-1) sum[0] += grid[i][j+1];
                    if (i != 0 && j != 0) sum[1] += grid[i-1][j-1];
                    if (i != n-1 && j != n-1) sum[1] += grid[i+1][j+1];
                    if (i != 0 && j != n-1) sum[1] += grid[i-1][j+1];
                    if (i != n-1 && j != 0) sum[1] += grid[i+1][j-1];
                    neighborSum.put(grid[i][j], sum);
                }
            }
        }

        public int adjacentSum(int value) {
            return neighborSum.get(value)[0];
        }

        public int diagonalSum(int value) {
            return neighborSum.get(value)[1];
        }
    }
}
