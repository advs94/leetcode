package hard;

public class DivideNodesIntoTheMaximumNumberOfGroups {
    /*
     * LC - 2493. Divide Nodes Into the Maximum Number of Groups
     */
    public int magnificentSets(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) graph.put(i, new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n + 1];
        int totalGroups = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                if (!isBipartite(graph, i, visited, component)) return -1;
                int maxDepth = 0;
                for (int node : component) {
                    maxDepth = Math.max(maxDepth, bfsMaxDepth(graph, node));
                }
                totalGroups += maxDepth;
            }
        }
        return totalGroups;
    }

    private boolean isBipartite(Map<Integer, List<Integer>> graph, int start, boolean[] visited, List<Integer> component) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> color = new HashMap<>();
        queue.add(start);
        color.put(start, 0);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            component.add(node);
            for (int neighbor : graph.get(node)) {
                if (!color.containsKey(neighbor)) {
                    queue.add(neighbor);
                    color.put(neighbor, 1 - color.get(node));
                    visited[neighbor] = true;
                } else if (color.get(neighbor) == color.get(node)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int bfsMaxDepth(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> level = new HashMap<>();
        queue.add(start);
        level.put(start, 1);
        int maxDepth = 1;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            int currLevel = level.get(node);
            for (int neighbor : graph.get(node)) {
                if (!level.containsKey(neighbor)) {
                    queue.add(neighbor);
                    level.put(neighbor, currLevel + 1);
                    maxDepth = Math.max(maxDepth, currLevel + 1);
                }
            }
        }
        return maxDepth;
    }
}
