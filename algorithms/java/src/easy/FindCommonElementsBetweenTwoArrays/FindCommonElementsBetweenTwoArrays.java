package easy;

public class FindCommonElementsBetweenTwoArrays {
    /*
     * LC - 2956. Find Common Elements Between Two Arrays
     */
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        final int[] ans = new int[2];
        for (int num1 : nums1) {
            for (int num2: nums2) {
                if (num1 == num2) {
                    ans[0]++;
                    break;
                }
            }
        }
        for (int num2 : nums2) {
            for (int num1: nums1) {
                if (num2 == num1) {
                    ans[1]++;
                    break;
                }
            }
        }
        return ans;
    }
}
