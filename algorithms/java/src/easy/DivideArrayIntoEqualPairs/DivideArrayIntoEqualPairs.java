package easy;

public class DivideArrayIntoEqualPairs {
    /*
     * LC - 2206. Divide Array Into Equal Pairs
     */
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for (int num : nums) freq[num]++;
        for (int num : freq) if ((num & 1) == 1) return false;
        return true;
    }
}
