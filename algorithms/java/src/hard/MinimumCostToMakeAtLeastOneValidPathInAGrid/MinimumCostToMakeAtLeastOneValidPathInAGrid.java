package hard;

public class MinimumCostToMakeAtLeastOneValidPathInAGrid {
    /*
     * LC - 1368. Minimum Cost to Make at Least One Valid Path in a Grid
     */
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // Right, Left, Down, Up
        int[][] minCost = new int[m][n]; // Track minimum cost to reach each cell
        for (int[] row : minCost) Arrays.fill(row, Integer.MAX_VALUE); // Initialize with max value
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // {i, j, cost}
        pq.offer(new int[]{0, 0, 0}); // Start from top-left with cost = 0
        minCost[0][0] = 0;
        // Keep cycle active until there's nothing more in the queue
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int i = current[0];
            int j = current[1];
            int cost = current[2];
            if (i == m - 1 && j == n - 1) return cost; // If we've reached the bottom-right, return cost
            if (cost > minCost[i][j]) continue; // Skip if this path is not optimal
            // Cicle through directions
            for (int dir = 0; dir < 4; dir++) {
                int newI = i + directions[dir][0];
                int newJ = j + directions[dir][1];
                int newCost = cost + (dir + 1 == grid[i][j] ? 0 : 1); // Add cost if direction mismatches grid
                if (newI >= 0 && newI < m && newJ >= 0 && newJ < n && newCost < minCost[newI][newJ]) {
                    minCost[newI][newJ] = newCost; // Update minimum cost to reach the new cell
                    pq.offer(new int[]{newI, newJ, newCost}); // Push new state into the priority queue
                }
            }
        }
        return -1; // Return -1 if no valid path exists
    }
}
