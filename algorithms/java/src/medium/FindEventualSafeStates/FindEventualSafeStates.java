package medium;

public class FindEventualSafeStates {
    /*
     * LC - 802. Find Eventual Safe States
     */
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int m = graph.length;
        List<List<Integer>> reverseGraph = new ArrayList<>();
        // Initialize the reverse graph
        for (int i = 0; i < m; i++) reverseGraph.add(new ArrayList<>());
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[m];
        // Build the reverse graph and calculate in-degrees
        for (int i = 0; i < m; i++) {
            int n = graph[i].length;
            inDegree[i] = n;
            if (n == 0) queue.add(i); // Terminal nodes
            else {
                for (int j = 0; j < n; j++) reverseGraph.get(graph[i][j]).add(i);
            }
        }
        boolean[] safe = new boolean[m];
        // Process nodes using a queue (topological sorting)
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Integer node = queue.poll();
                safe[node] = true;
                for (int neighbor : reverseGraph.get(node)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) queue.offer(neighbor);
                }
            }
        }
        // Collect all safe nodes
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (safe[i]) result.add(i);
        }
        return result;
    }
}
