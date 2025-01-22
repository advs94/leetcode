package medium;

public class MapOfHighestPeak {
    /*
     * LC - 1765. Map of Highest Peak
     */
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        PriorityQueue <int[]> pq = new PriorityQueue<>((a, b) -> isWater[a[0]][a[1]] - isWater[b[0]][b[1]]);
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 0) {
                    isWater[i][j] = 1;
                } else {
                    isWater[i][j] = 0;
                    visited[i][j] = true;
                    pq.offer(new int[]{i,j});
                }
            }
        }
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()) {
            int[] coordinates = pq.poll();
            int x = coordinates[0];
            int y = coordinates[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + directions[i][0];
                int newY = y + directions[i][1];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]) {
                    isWater[newX][newY] = isWater[x][y] + 1;
                    visited[newX][newY] = true;
                    pq.offer(new int[]{newX,newY});
                }
            }
        }
        return isWater;
}
