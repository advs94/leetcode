package medium;

public class CountServersThatCommunicate {
    /*
     * LC - 1267. Count Servers that Communicate
     */
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        // Count the number of servers in each row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    row[i]++; // Increment row count
                    col[j]++; // Increment column count
                }
            }
        }
        int total = 0;
        // Count servers that can communicate
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (row[i] > 1 || col[j] > 1)) total++; // Add if server communicates
            }
        }
        return total;
    }
}
