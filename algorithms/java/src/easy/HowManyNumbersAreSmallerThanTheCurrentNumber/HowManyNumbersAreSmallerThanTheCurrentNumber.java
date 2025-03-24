package easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    /*
     * LC - 1365. How Many Numbers Are Smaller Than the Current Number
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        final int n = nums.length;
        final int[] sortedNums = new int[n];
        System.arraycopy(nums, 0, sortedNums, 0, n);
        Arrays.sort(sortedNums);
        final int[] smallerNumbers = new int[n];
        for (int i = 0; i < n; i++) smallerNumbers[i] = firstOccurrence(sortedNums, nums[i]);
        return smallerNumbers;
    }

    private int firstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
