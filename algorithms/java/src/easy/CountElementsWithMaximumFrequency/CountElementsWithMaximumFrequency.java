package easy;

public class CountElementsWithMaximumFrequency {
    /*
     * LC - 3005. Count Elements With Maximum Frequency
     */
    public int maxFrequencyElements(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int num : nums) max = Math.max(max, map.merge(num, 1, Integer::sum));
        int count = 0;
        for (int value : map.values()) {
            if (value == max) {
                count += value;
            }
        }
        return count;
    }
}
