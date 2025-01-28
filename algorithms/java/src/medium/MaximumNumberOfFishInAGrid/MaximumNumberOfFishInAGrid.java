package medium;

public class MaximumNumberOfFishInAGrid {
    /*
     * LC - 2658. Maximum Number of Fish in a Grid
     */
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) maxFish = Math.max(maxFish, lcDfs(i, j, grid));
            }
        }
        return maxFish;
    }

    private final int[] dir = {0,1,0,-1,0};

    private int lcDfs(int x, int y, int[][] grid) {
        int fish = grid[x][y];
        grid[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int newX = x+dir[i];
            int newY = y+dir[i+1];
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[newX].length && grid[newX][newY] > 0) {
                fish += lcDfs(newX, newY, grid);
            }
        }
        return fish;
    }
}
