package easy;

public class FindMissingAndRepeatedValues {
    /*
     * LC - 2965. Find Missing and Repeated Values
     */
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        final int n = grid.length;
        final boolean[] visited = new boolean[n*n+1];
        int repeated = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[grid[i][j]]) repeated = grid[i][j];
                else visited[grid[i][j]] = true;
            }
        }
        for (int i = 1; i <= n*n; i++) if (!visited[i]) return new int[]{repeated, i};
        return null;
    }
}
