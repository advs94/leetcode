package easy;

public class FindTheXorOfNumbersWhichAppearTwice {
    /*
     * LC - 3158. Find the XOR of Numbers Which Appear Twice
     */
    public int duplicateNumbersXOR(int[] nums) {
        final int[] freq = new int[51];
        for (int num : nums) freq[num]++;
        int xor = 0;
        for (int i = 1; i < 51; i++) {
            if (freq[i] == 2) {
                xor ^= i;
            }
        }
        return xor;
    }
}
