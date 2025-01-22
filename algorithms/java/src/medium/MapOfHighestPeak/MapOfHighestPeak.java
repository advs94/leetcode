package medium;

public class MapOfHighestPeak {
    /*
     * LC - 1765. Map of Highest Peak
     */
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] height = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    height[i][j] = 0;
                    queue.add(new int[]{i,j});
                } else {
                    height[i][j] = -1;
                }
            }
        }
        int heightValue = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] coordinates = queue.poll();
                int x = coordinates[0];
                int y = coordinates[1];
                if (x > 0 && height[x-1][y] == -1) {
                    height[x-1][y] = heightValue;
                    queue.add(new int[]{x-1, y});
                }
                if (x < height.length-1 && height[x+1][y] == -1) {
                    height[x+1][y] = heightValue;
                    queue.add(new int[]{x+1, y});
                }
                if (y > 0 && height[x][y-1] == -1) {
                    height[x][y-1] = heightValue;
                    queue.add(new int[]{x, y-1});
                }
                if (y < height[x].length-1 && height[x][y+1] == -1) {
                    height[x][y+1] = heightValue;
                    queue.add(new int[]{x, y+1});
                }
            }
            heightValue++;
        }
        return height;
}
