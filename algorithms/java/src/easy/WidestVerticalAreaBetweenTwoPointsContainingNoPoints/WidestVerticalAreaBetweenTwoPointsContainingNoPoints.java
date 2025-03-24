package easy;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    /*
     * LC - 1637. Widest Vertical Area Between Two Points Containing No Points
     */
    public int maxWidthOfVerticalArea(int[][] points) {
        final int n = points.length;
        final int[] sortedX = new int[n];
        for (int x = 0; x < n; x++) sortedX[x] = points[x][0];
        Arrays.sort(sortedX);
        int area = sortedX[1] - sortedX[0];
        for (int x = 2; x < n; x++) area = Math.max(area, sortedX[x]-sortedX[x-1]);
        return area;
    }
}
