package easy;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    /*
     * LC - 2379. Minimum Recolors to Get K Consecutive Black Blocks
     */
    public int minimumRecolors(String blocks, int k) {
        final int n = blocks.length(), index = k-1;
        int min = k;
        char cur;
        for (int i = 0, start = 0, temp = 0; i < n; i++) {
            cur = blocks.charAt(i);
            if (i > index) {
                if (blocks.charAt(start) == 'W' && cur == 'B' && min > --temp) min = temp;
                else if (blocks.charAt(start) == 'B' && cur == 'W') temp++;
                start++;
            } else {
                if (cur == 'W') {
                    temp++;
                }
                if (i == index) {
                    min = temp;
                }
            }
        }
        return min;
    }
}
