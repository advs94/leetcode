package easy;

public class RowWithMaximumOnes {
    /*
     * LC - 2643. Row With Maximum Ones
     */
    public int[] rowAndMaximumOnes(int[][] mat) {
        final int[] res = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int freq = 0;
            for (int num : mat[i]) freq += num;
            if (freq > res[1]) {
                res[0] = i;
                res[1] = freq;
            }
        }
        return res;
    }
}
