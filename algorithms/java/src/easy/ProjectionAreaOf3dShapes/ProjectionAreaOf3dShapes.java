package easy;

public class ProjectionAreaOf3dShapes {
    /*
     * LC - 883. Projection Area of 3D Shapes
     */
    public int projectionArea(int[][] grid) {
        final int m = grid.length, n = grid[0].length;
        final int[] xz = new int[m], yz = new int[n];
        int area = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                area += Math.min(grid[i][j], 1);
                if (xz[i] < grid[i][j]) {
                    area += grid[i][j] - xz[i];
                    xz[i] = grid[i][j];
                }
                if (yz[j] < grid[i][j]) {
                    area += grid[i][j] - yz[j];
                    yz[j] = grid[i][j];
                }
            }
        }
        return area;
    }
}
