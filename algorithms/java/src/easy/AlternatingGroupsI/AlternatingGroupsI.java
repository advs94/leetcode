package easy;

public class AlternatingGroupsI {
    /*
     * LC - 3206. Alternating Groups I
     */
    public int numberOfAlternatingGroups(int[] colors) {
        final int n = colors.length;
        int count = 0;
        for (int left = 0, mid = 1, right = 2; left < n; left++, mid = (mid + 1) % n, right = (right + 1) % n) {
            if (colors[left] != colors[mid] && colors[left] == colors[right]) {
                count++;
            }
        }
        return count;
    }
}
