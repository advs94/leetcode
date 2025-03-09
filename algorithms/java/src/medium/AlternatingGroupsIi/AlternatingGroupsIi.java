package medium;

public class AlternatingGroupsIi {
    /*
     * LC - 3208. Alternating Groups II
     */
    public int numberOfAlternatingGroups(int[] colors, int k) {
        final int n = colors.length;
        int num = 0;
        for (int i = 0, j = 1, prev = colors[0]; i < n; prev = colors[j], j = ++j % n) {
            if (j == i) return num;
            if (prev == colors[j] && j < i) return num;
            if (prev == colors[j] && j > i) {
                i = j;
            } else if (k == (j - i + n) % n + 1 && prev != colors[j]) {
                num++;
                i++;
            }
        }
        return num;
    }
}
