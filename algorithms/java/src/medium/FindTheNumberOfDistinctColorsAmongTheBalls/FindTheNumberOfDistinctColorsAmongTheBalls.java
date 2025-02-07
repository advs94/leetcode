package medium;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    /*
     * LC - 3160. Find the Number of Distinct Colors Among the Balls
     */
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] results = new int[n];
        Map<Integer, Integer> balls = new HashMap<>();
        Map<Integer, Integer> distinctColors = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];
            if (balls.containsKey(ball)) {
                if (balls.get(ball) == newColor) {
                    results[i] = distinctColors.size();
                    continue;
                }
                int oldColor = balls.get(ball);
                if (distinctColors.merge(oldColor, -1, Integer::sum) == 0) {
                    distinctColors.remove(oldColor);
                }
            }
            balls.put(ball, newColor);
            distinctColors.merge(newColor, 1, Integer::sum);
            results[i] = distinctColors.size();
        }
        return results;
    }
}
