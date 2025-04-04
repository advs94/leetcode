package easy;

public class SortArrayByIncreasingFrequency {
    /*
     * LC - 1636. Sort Array by Increasing Frequency
     */
    public int[] frequencySort(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.merge(num, 1, Integer::sum);
        final Map<Integer, List<Integer>> tree = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            tree.merge(
                entry.getValue(),
                new ArrayList<>(List.of(entry.getKey())),
                (list, ignored) -> {
                    int i = 0;
                    while (i < list.size() && list.get(i) > entry.getKey()) i++;
                    list.add(i, entry.getKey());
                    return list;
                }
            );
        }
        final int[] sortedFreq = new int[nums.length];
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : tree.entrySet()) {
            for (int num : entry.getValue()) {
                for (int j = 0; j < entry.getKey(); j++) {
                    sortedFreq[i++] = num;
                }
            }
        }
        return sortedFreq;
    }
}
