package easy;

public class SubarraysDistinctElementSumOfSquaresI {
    /*
     * LC - 2913. Subarrays Distinct Element Sum of Squares I
     */
    public int sumCounts(List<Integer> nums) {
        final int n = nums.size();
        int sum = n;
        for (int i = 0; i < n; i++) {
            final Set<Integer> set = new HashSet<>();
            set.add(nums.get(i));
            for (int j = i+1; j < n; j++) {
                set.add(nums.get(j));
                sum += set.size() * set.size();
            }
        }
        return sum;
    }
}
