package easy;

public class MergeSimilarItems {
    /*
     * LC - 2363. Merge Similar Items
     */
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        final int[] weights = new int[1001];
        for (int[] arr : items1) weights[arr[0]] = arr[1];
        for (int[] arr : items2) weights[arr[0]] += arr[1];
        final List<List<Integer>> matrix = new ArrayList<>();
        for (int value = 0; value < 1001; value++) {
            if (weights[value] != 0) {
                matrix.add(List.of(value, weights[value]));
            }
        }
        return matrix;
    }
}
