package easy;

public class UniqueNumberOfOccurrences {
    /*
     * LC - 1207. Unique Number of Occurrences
     */
    public boolean uniqueOccurrences(int[] arr) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.merge(num, 1, Integer::sum);
        final boolean[] freq = new boolean[1001];
        for (int value : map.values()) {
            if (freq[value]) {
                return false;
            }
            freq[value] = true;
        }
        return true;
    }
}
