package easy;

public class TheKWeakestRowsInAMatrix {
    /*
     * LC - 1337. The K Weakest Rows in a Matrix
     */
    public int[] kWeakestRows(int[][] mat, int k) {
        final List<Integer>[] arr = new List[101];
        for (int i = 0; i < 101; i++) arr[i] = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int num : mat[i]) {
                if (num == 1) count++;
                else break;
            }
            arr[count].add(i);
        }
        final int[] res = new int[k];
        for (int i = 0, j = 0; i < 101; i++) {
            for (int num : arr[i]) {
                res[j++] = num;
                if (j == k) {
                    return res;
                }
            }
        }
        return null;
    }
}
