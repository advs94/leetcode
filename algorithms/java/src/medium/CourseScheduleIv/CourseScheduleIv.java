package medium;

public class CourseScheduleIv {
    /*
     * LC - 1462. Course Schedule IV
     */
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int n = prerequisites.length;
        int m = queries.length;
        if (n == 0) {
            List<Boolean> answers = new ArrayList<>();
            for (int i = 0; i < m; i++) answers.add(false);
            return answers;
        }
        List<Integer> graph[] = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList<>();
        for (int[] pair : prerequisites) graph[pair[0]].add(pair[1]);
        boolean[][] isReachable = new boolean[numCourses][numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!isReachable[i][i]) dfs(i, graph, isReachable);
        }
        List<Boolean> answers = new ArrayList<>();
        for (int[] query : queries) answers.add(isReachable[query[0]][query[1]]);
        return answers;
    }

    private void dfs(int current, List<Integer> graph[], boolean[][] isReachable) {
        isReachable[current][current] = true;
        for (int neighbor : graph[current]) {
            if (!isReachable[current][neighbor]) {
                isReachable[current][neighbor] = true;
                dfs(neighbor, graph, isReachable);
                for (int i = 0; i < isReachable.length; i++) isReachable[current][i] |= isReachable[neighbor][i];
            }
        }
    }
}
