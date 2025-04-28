package easy;

public class MinimumSubsequenceInNon-increasingOrder {
    /*
     * LC - 1403. Minimum Subsequence in Non-Increasing Order
     */
    public List<Integer> minSubsequence(int[] nums) {
        final int[] arr = new int[101];
        int total = 0;
        for (int num : nums) {
            arr[num]++;
            total += num;
        }
        final List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 100; i > 0; i--) {
            while (arr[i]-- > 0) {
                sum += i;
                total -= i;
                list.add(i);
                if (sum > total) {
                    return list;
                }
            }
        }
        return null;
    }
}
