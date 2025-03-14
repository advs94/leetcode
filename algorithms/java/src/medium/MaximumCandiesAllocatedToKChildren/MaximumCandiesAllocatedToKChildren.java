package medium;

public class MaximumCandiesAllocatedToKChildren {
    /*
     * LC - 2226. Maximum Candies Allocated to K Children
     */
    public int maximumCandies(int[] candies, long k) {
        int left = 1, right = 0;
        for (int candy : candies) right = Math.max(right, candy);
        int max = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;
            for (int candy : candies) count += candy / mid;
            if (count >= k) {
                max = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return max;
    }
}
