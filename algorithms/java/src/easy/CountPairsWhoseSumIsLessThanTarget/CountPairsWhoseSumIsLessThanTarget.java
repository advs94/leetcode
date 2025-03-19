package easy;

public class CountPairsWhoseSumIsLessThanTarget {
    /*
     * LC - 2824. Count Pairs Whose Sum is Less than Target
     */
    public int countPairs(List<Integer> nums, int target) {
        final int n = nums.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
