package easy;

public class FindTheK-orOfAnArray {
    /*
     * LC - 2917. Find the K-or of an Array
     */
    public int findKOr(int[] nums, int k) {
        final int[] bits = new int[32];
        for (int num : nums) {
            final int high = 31 - Integer.numberOfLeadingZeros(num);
            for (int low = 0; low <= high; low++) {
                bits[low] += ((num >>> low) & 1);
            }
        }
        int kor = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] >= k) {
                kor += (1 << i);
            }
        }
        return kor;
    }
}
