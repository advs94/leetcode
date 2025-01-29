package medium;

public class RedundantConnection {
    /*
     * LC - 684. Redundant Connection
     */
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        int[] lastRedundantEdge = new int[2];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (find(u) == find(v)) lastRedundantEdge = edge;
            else union(u, v);
        }
        return lastRedundantEdge;
    }

    private int[] parent;
    private int[] size;

    // Helper function for find operation with path compression
    private int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]); // Path compression
        return parent[x];
    }

    // Helper function for union operation by size
    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) return; // If they are already in the same set, don't union (cycle detected)
        // Union by size: attach the smaller tree to the larger one
        if (size[rootX] < size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        } else {
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }
    }
}
