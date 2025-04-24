package easy;

public class IslandPerimeter {
    /*
     * LC - 463. Island Perimeter
     */
    public int islandPerimeter(int[][] grid) {
        final int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (grid[x][y] == 1) {
                    count += 4;
                    if (x != 0 && grid[x-1][y] == 1) {
                        count--;
                    }
                    if (x != m - 1 && grid[x+1][y] == 1) {
                        count--;
                    }
                    if (y != 0 && grid[x][y-1] == 1) {
                        count--;
                    }
                    if (y != n - 1 && grid[x][y+1] == 1) {
                        count--;
                    }
                }
            }
        }
        return count;
    }
}
