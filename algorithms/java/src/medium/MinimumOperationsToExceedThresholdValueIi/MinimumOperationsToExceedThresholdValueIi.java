package medium;

public class MinimumOperationsToExceedThresholdValueIi {
    /*
     * LC - 3066. Minimum Operations to Exceed Threshold Value II
     */
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long) num);
        }
        int steps = 0;
        while (pq.size() > 1) {
            long x = pq.poll();
            if (x >= k) break;
            long y = pq.poll();
            long newValue = Math.min(x,y) * 2 + Math.max(x,y);
            pq.offer(newValue);
            steps++;
        }
        return steps;
    }
}
