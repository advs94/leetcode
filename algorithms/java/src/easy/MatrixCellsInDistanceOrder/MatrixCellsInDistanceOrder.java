package easy;

public class MatrixCellsInDistanceOrder {
    /*
     * LC - 1030. Matrix Cells in Distance Order
     */
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        final Queue<int[]> pq = new LinkedList<>();
        final int[][] mat = new int[rows * cols][2];
        final boolean[][] vis = new boolean[rows][cols];
        pq.offer(new int[]{rCenter,cCenter});
        vis[rCenter][cCenter] = true;
        int i = 0;
        final int[] dirs = {-1, 0, 1, 0, -1};
        while (!pq.isEmpty()) {
            for (int n = pq.size(); n > 0; --n) {
                var p = pq.poll();
                mat[i++] = p;
                for (int k = 0; k < 4; k++) {
                    int x = p[0] + dirs[k], y = p[1] + dirs[k+1];
                    if (x >= 0 && x < rows && y >= 0 && y < cols && !vis[x][y]) {
                        vis[x][y] = true;
                        pq.offer(new int[]{x,y});
                    }
                }
            }
        }
        return mat;
    }
}
