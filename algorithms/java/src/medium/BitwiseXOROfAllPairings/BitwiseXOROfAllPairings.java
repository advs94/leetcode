package medium;

public class BitwiseXOROfAllPairings {
    /*
     * LC - 2425. Number of Common Factors
     */
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xorAllNums1 = 0;
        int xorAllNums2 = 0;
        if (nums1.length % 2 != 0) {
            for (int num2 : nums2) xorAllNums2 ^= num2; // XOR all elements in nums2 if nums1 length is odd
        }
        if (nums2.length % 2 != 0) {
            for (int num1 : nums1) xorAllNums1 ^= num1; // XOR all elements in nums1 if nums2 length is odd
        }
        return xorAllNums1 ^ xorAllNums2; // Return XOR of the results
    }
}
