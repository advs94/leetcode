package hard;

public class TrappingRainWaterII {
    /*
     * LC - 407. Trapping Rain Water II
     */
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        if (m <= 2 || n <= 2) return 0; // No trapping possible with borders only.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // {i, j, height}
        boolean [][] visited  = new boolean[m][n];
        int trappedWater = 0;
        // Add all border cells to the priority queue and mark them as visited
        for (int i = 0; i < m; i++) {
            pq.offer(new int[] { i, 0, heightMap[i][0] });
            pq.offer(new int[] { i, n - 1, heightMap[i][n - 1] });
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int j = 1; j < n - 1; j++) {
            pq.offer(new int[] { 0, j, heightMap[0][j] });
            pq.offer(new int[] { m - 1, j, heightMap[m - 1][j] });
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }
        // Directions for traversal: right, left, down, up
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        // Process cells in increasing order of height
        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int i = cell[0];
            int j = cell[1];
            int curHeight = cell[2];
            // Visit all neighbors
            for (int[] dir : directions) {
                int ni = i + dir[0];
                int nj = j + dir[1];
                if (ni >= 0 && ni < m && nj >= 0 && nj < n && !visited[ni][nj]) {
                    visited[ni][nj] = true;
                    // Calculate water trapped
                    trappedWater += Math.max(0, curHeight - heightMap[ni][nj]);
                    // Add the neighbor to the priority queue with the updated boundary height
                    pq.offer(new int[] { ni, nj, Math.max(curHeight, heightMap[ni][nj]) });
                }
            }
        }
        return trappedWater;
    }
}
