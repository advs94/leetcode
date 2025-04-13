package easy;

public class IntersectionOfTwoArrays {
    /*
     * LC - 349. Intersection of Two Arrays
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        final boolean[] freq1 = new boolean[1001], freq2 = new boolean[1001];
        for (int num : nums1) freq1[num] = true;
        int len = 0;
        for (int num : nums2) {
            if (freq1[num]) {
                freq1[num] = false;
                freq2[num] = true;
                len++;
            }
        }
        final int[] arr = new int[len];
        int j = 0;
        for (int i = 0; i < 1001; i++) {
            if (freq2[i]) {
                arr[j++] = i;
            }
        }
        return arr;
    }
}
