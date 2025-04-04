package easy;

public class LuckyNumbersInAMatrix {
    /*
     * LC - 1380. Lucky Numbers in a Matrix
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        final int m = matrix.length, n = matrix[0].length;
        final int[] rowMin = new int[m], colMax = new int[n];
        for (int i = 0; i < m; i++) {
            rowMin[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowMin[i] == matrix[i][j] && colMax[j] == matrix[i][j]) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
