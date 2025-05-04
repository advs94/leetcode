package easy;

public class FindChampionI {
    /*
     * LC - 2923. Find Champion I
     */
    public int findChampion(int[][] grid) {
        final int n = grid.length;
        for (int i = 0; i < n; i++) {
            int j = 0;
            for (j = 0; j < n; j++) {
                if (i != j && grid[i][j] == 0) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
}
