package easy;

public class MinimumAverageOfSmallestAndLargestElements {
    /*
     * LC - 3194. Minimum Average of Smallest and Largest Elements
     */
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        final int n = nums.length;
        double min = Double.MAX_VALUE;
        for (int i = 0 ; i < n/2; i++) min = Math.min(min, ((double) nums[i]+nums[n-1-i])/2);
        return min;
    }
}
