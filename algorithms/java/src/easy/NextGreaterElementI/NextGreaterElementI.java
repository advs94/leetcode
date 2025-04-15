package easy;

public class NextGreaterElementI {
    /*
     * LC - 496. Next Greater Element I
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        final int m = nums1.length, n = nums2.length;
        final int[] arr = new int[10001];
        for (int i = 0; i < n; i++) arr[nums2[i]] = i;
        for (int i = 0; i < m; i++) {
            int j = arr[nums1[i]];
            while (++j < n) {
                if (nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    break;
                }
            }
            if (j == n) {
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
