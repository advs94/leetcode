package easy;

public class MinimumCostToReachEveryPosition {
    /*
     * LC - 3502. Minimum Cost to Reach Every Position
     */
    public int[] minCosts(int[] cost) {
        int min = cost[0];
        for (int i = 1; i < cost.length; i++) {
            min = Math.min(min, cost[i]);
            cost[i] = min;
        }
        return cost;
    }
}
