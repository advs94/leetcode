package easy;

public class FindTheDistinctDifferenceArray {
    /*
     * LC - 2670. Find the Distinct Difference Array
     */
    public int[] distinctDifferenceArray(int[] nums) {
        final int[] freq = new int[51];
        final int n = nums.length;
        final int[] prefix = new int[n], sufix = new int[n], res = new int[n];
        for (int i = 0, unique = 0; i < n; i++) {
            if (freq[nums[i]]++ == 0) {
                prefix[i] = ++unique;
            } else {
                prefix[i] = unique;
            }
        }
        for (int i = 0, unique = prefix[n-1]; i < n; i++) {
            if (freq[nums[i]]-- == 1) {
                sufix[i] = --unique;
            } else {
                sufix[i] = unique;
            }
        }
        for (int i = 0; i < n; i++) res[i] = prefix[i] - sufix[i];
        return res;
    }
}
