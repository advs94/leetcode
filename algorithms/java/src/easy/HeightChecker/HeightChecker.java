package easy;

public class HeightChecker {
    /*
     * LC - 1051. Height Checker
     */
    public int heightChecker(int[] heights) {
        final int[] freq = new int[101];
        for (int height : heights) freq[height]++;
        int index = 0, count = 0;
        for (int height = 1; height < 101; height++) {
            while (freq[height]-- > 0) {
                if (heights[index++] != height) {
                    count++;
                }
            }
        }
        return count;
    }
}
