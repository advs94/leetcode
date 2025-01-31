package hard;

public class MakingALargeIsland {
    /*
     * LC - 827. Making A Large Island
     */
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        Map<Integer, Integer> islandSizes = new HashMap<>();
        int islandIndex = 2;
        int maxIsland = 0;
        int[] dir = {1, 0, -1, 0, 1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = bfs(grid, i, j, islandIndex, dir);
                    islandSizes.put(islandIndex, size);
                    maxIsland = Math.max(maxIsland, size);
                    islandIndex++;
                }
            }
        }
        if (maxIsland == n * n) return maxIsland;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> neighboringIslands = new HashSet<>();
                    int possibleSize = 1;
                    for (int k = 0; k < 4; k++) {
                        int newX = i + dir[k];
                        int newY = j + dir[k + 1];
                        if (newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] > 1) {
                            neighboringIslands.add(grid[newX][newY]);
                        }
                    }
                    for (int index : neighboringIslands) {
                        possibleSize += islandSizes.get(index);
                    }
                    maxIsland = Math.max(maxIsland, possibleSize);
                }
            }
        }
        return maxIsland;
    }

    private int bfs(int[][] grid, int i, int j, int islandIndex, int[] dir) {
        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        grid[i][j] = islandIndex;
        int size = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int k = 0; k < 4; k++) {
                int newX = x + dir[k];
                int newY = y + dir[k + 1];
                if (newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] == 1) {
                    grid[newX][newY] = islandIndex;
                    queue.add(new int[]{newX, newY});
                    size++;
                }
            }
        }
        return size;
    }
}
