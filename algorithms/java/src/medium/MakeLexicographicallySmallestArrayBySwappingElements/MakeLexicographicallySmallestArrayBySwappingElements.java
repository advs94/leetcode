package medium;

public class MakeLexicographicallySmallestArrayBySwappingElements {
    /*
     * LC - 2948. Make Lexicographically Smallest Array by Swapping Elements
     */
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length; // Get the length of the input array
        int[][] b = new int[n][2]; // Create a 2D array to store the elements and their original indices
        for(int i = 0; i < n; i++) {
            b[i][0] = nums[i]; // Store the element in the first column
            b[i][1] = i;       // Store the original index in the second column
        }
        Arrays.sort(b, (p, q) -> {
            return p[0] - q[0]; // Compare the first column of each element (the value)
        });
        DSU dsu = new DSU(n); // Initialize the Disjoint Set Union (DSU) to manage connected components
        for(int i = 1; i < n; i++) {
            if (b[i][0] - b[i - 1][0] <= limit) { // Connect elements in DSU if their difference in value is <= limit
                dsu.union(b[i][1], b[i - 1][1]); // Union elements that can be swapped
            }
        }
        Map<Integer, List<Integer>> subtrees = new HashMap<>(); // Create a map to group elements based on their root in the DSU
        for(int i = 0; i < n; i++) subtrees.put(i, new ArrayList<>()); // Initialize the map with empty lists for each possible root
        for(int i = 0; i < n; i++) {
            subtrees.get(dsu.root(i)).add(i); // Populate the map by adding each index to the list of its root's component
        }
        int[] ans = new int[n]; // Array to store the resulting lexicographically smallest array
        for(int i = 0; i < n; i++) {
            if (dsu.root(i) != i) continue; // Skip if the root has already been processed
            List<int[]> component = new ArrayList<>(); // List to store the indices and values of the component elements
            for(int j : subtrees.get(i)) {
                component.add(new int[]{j, nums[j]}); // Store the index and the value
            }
            Collections.sort(component, (p, q) -> p[1] - q[1]); // Sort by the second column (the value)
            for(int j = 0; j < component.size(); j++) {
                ans[subtrees.get(i).get(j)] = component.get(j)[1]; // Assign sorted value to the original index
            }
        }
        return ans; // Return the lexicographically smallest array
    }

    /*
     * DSU (Disjoint Set Union) class used for managing connected components efficiently
     * Implements union-find with path compression and union by size.
     */
    public static class DSU {
        private int[] id;   // Array to store the parent of each element
        private int[] size; // Array to store the size of each component
        public DSU(int n) {
            id = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                id[i] = i;   // Each element is its own parent initially
                size[i] = 1;  // Each component starts with size 1
            }
        }
        public int root(int u) {
            while (u != id[u]) {
                id[u] = id[id[u]]; // Path compression: point directly to the grandparent
                u = id[u];          // Move to the parent
            }
            return u; // Return the root of the element
        }
        public boolean connected(int u, int v) {
            return root(u) == root(v); // They are connected if they share the same root
        }
        public void union(int u, int v) {
            if (connected(u, v)) return; // No need to union if they are already connected
            int p = root(u); // Find the root of element u
            int q = root(v); // Find the root of element v
            if (size[p] < size[q]) {
                id[p] = q;  // Make q the root of p
                size[q] += size[p]; // Increase the size of q's component
            } else {
                id[q] = p;  // Make p the root of q
                size[p] += size[q]; // Increase the size of p's component
            }
        }
    }
}
