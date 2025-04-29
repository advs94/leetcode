package easy;

public class LongestSubsequenceWithLimitedSum {
    /*
     * LC - 2389. Longest Subsequence With Limited Sum
     */
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        final int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) arr[i] = arr[i-1] + nums[i];
        for (int i = 0; i < queries.length; i++) {
            int pos = Arrays.binarySearch(arr, queries[i]);
            if (pos > 0) {
                queries[i] = pos + 1;
            } else {
                queries[i] = Math.abs(pos + 1);
            }
        }
        return queries;
    }
}
