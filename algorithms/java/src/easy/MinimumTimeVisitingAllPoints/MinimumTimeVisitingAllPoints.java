package easy;

public class MinimumTimeVisitingAllPoints {
    /*
     * LC - 1266. Minimum Time Visiting All Points
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] cur = points[0];
        int min = 0;
        for (int i = 1; i < points.length; i++) {
            min += Math.max(Math.abs(cur[0]-points[i][0]), Math.abs(cur[1]-points[i][1]));
            cur = points[i];
        }
        return min;
    }
}
