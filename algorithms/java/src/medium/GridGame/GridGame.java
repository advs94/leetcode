package medium;

public class GridGame {
    /*
     * LC - 2017. Grid Game
     */
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        // Calculate prefix sums for both rows
        long[][] prefix = new long[2][n];
        prefix[0][0] = grid[0][0];
        prefix[1][0] = grid[1][0];
        for (int i = 1; i < n; i++) {
            prefix[0][i] = prefix[0][i - 1] + grid[0][i];
            prefix[1][i]= prefix[1][i - 1] + grid[1][i];
        }
        // Determine the minimum maximum score for Robot 2
        long minSecondRobotScore = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // Score Robot 2 would get if Robot 1 cuts at column i
            long topRemaining = i == n - 1 ? 0 : prefix[0][n - 1] - prefix[0][i];
            long bottomRemaining = i == 0 ? 0 : prefix[1][i - 1];
            long secondRobotScore = Math.max(topRemaining, bottomRemaining);
            // Minimize the maximum score Robot 2 can achieve
            minSecondRobotScore = Math.min(minSecondRobotScore, secondRobotScore);
        }
        return minSecondRobotScore;
    }
}
