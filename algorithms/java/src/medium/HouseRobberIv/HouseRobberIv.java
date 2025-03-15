package medium;

public class HouseRobberIv {
    /*
     * LC - 2560. House Robber IV
     */
    public int minCapability(int[] nums, int k) {
        final int n = nums.length;
        int left = 1, right = (int) 1e9;
        while (left < right) {
            int mid = (left + right) / 2, take = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    take += 1;
                    i++;
                }
            }
            if (take >= k) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
