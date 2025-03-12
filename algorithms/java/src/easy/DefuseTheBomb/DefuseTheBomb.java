package easy;

public class DefuseTheBomb {
    /*
     * LC - 1652. Defuse the Bomb
     */
    public int[] decrypt(int[] code, int k) {
        final int n = code.length;
        final int[] res = new int[n];
        if (k == 0) return res;
        if (k < 0) {
            for (int i = 0, j = (k + n) % n; i < n; i++, j = (i + k + n) % n) {
                while (j != i) {
                    res[i] += code[j];
                    j = (++j + n) % n;
                }
            }
        } else {
            for (int i = 0, j = (k + n) % n; i < n; i++, j = (i + k + n) % n) {
                while (j != i) {
                    res[i] += code[j];
                    j = (--j + n) % n;
                }
            }
        }
        return res;
    }
}
