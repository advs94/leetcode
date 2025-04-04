package easy;

public class CellsWithOddValuesInAMatrix {
    /*
     * LC - 1252. Cells with Odd Values in a Matrix
     */
    public int oddCells(int m, int n, int[][] indices) {
        final Set<Integer> set = new HashSet<>();
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            for (int j = 0; j < n; j++) {
                int cell = row * n + j;
                if (set.contains(cell)) {
                    set.remove(cell);
                } else {
                    set.add(cell);
                }
            }
            int col = indices[i][1];
            for (int j = 0; j < m; j++) {
                int cell = j * n + col;
                if (set.contains(cell)) {
                    set.remove(cell);
                } else {
                    set.add(cell);
                }
            }
        }
        return set.size();
    }
}
