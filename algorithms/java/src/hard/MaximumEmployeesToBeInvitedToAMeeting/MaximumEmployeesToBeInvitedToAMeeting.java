package hard;

public class MaximumEmployeesToBeInvitedToAMeeting {
    /*
     * LC - 2127. Maximum Employees to Be Invited to a Meeting
     */
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;  // Get the number of employees
        List<List<Integer>> graph = new ArrayList<>();  // Adjacency list for the graph
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());  // Initialize graph
        List<List<Integer>> pairs = new ArrayList<>();  // List of pairs of mutual favorite employees
        for (int i = 0; i < n; i++) {  // Iterate through each employee
            if (i == favorite[favorite[i]]) {  // Check if the employee and their favorite are mutual
                if (i < favorite[i]) {  // Ensure each pair is added only once
                    List<Integer> pair = new ArrayList<>();  // Create a new pair
                    pair.add(i);  // Add employee to the pair
                    pair.add(favorite[i]);  // Add their favorite to the pair
                    pairs.add(pair);  // Add the pair to the list of pairs
                }
            } else {
                graph.get(favorite[i]).add(i);  // Add the employee to the graph of their favorite
            }
        }
        boolean[] visited = new boolean[n];  // Keep track of visited employees
        int answer = 0;  // Final answer for the maximum number of invitations
        for (List<Integer> pair : pairs)  // Iterate through the pairs
            answer += dfs(graph, pair.get(0), visited) + dfs(graph, pair.get(1), visited);  // Add the invitations for each pair
        int[] counter = new int[favorite.length];  // Counter for the employee visits
        int[] round = new int[favorite.length];  // Round tracker for each employee
        int rnd = 1;  // Current round
        int circleMax = 0;  // Maximum circle size found
        for (int i = 0; i < favorite.length; i++) {  // Iterate through each employee
            if (visited[i]) continue;  // Skip already visited employees
            if (round[i] != 0) continue;  // Skip employees already in a circle
            int cnt = 1;  // Counter for the current circle
            int j = i;  // Start from the current employee
            while (counter[j] == 0) {  // Traverse the chain of favorites
                counter[j] = cnt++;  // Mark the employee as visited in this circle
                round[j] = rnd;  // Assign the current round to the employee
                j = favorite[j];  // Move to the next favorite employee
            }
            if (round[j] == rnd++) circleMax = Math.max(circleMax, cnt - counter[j]);  // Check for circle and update max size
        }
        return Math.max(circleMax, answer);  // Return the maximum of the two
    }

    private int dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;  // Mark the node as visited
        int max = 0;  // Initialize the maximum depth
        for (int neighbor : graph.get(node))  // Iterate through the neighbors of the node
            max = Math.max(max, dfs(graph, neighbor, visited));  // Update the maximum depth recursively
        return max + 1;  // Return the depth including the current node
    }
}
