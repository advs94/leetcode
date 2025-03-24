package easy;

public class SumOfValuesAtIndicesWithKSetBits {
    /*
     * LC - 2859. Sum of Values at Indices With K Set Bits
     */
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) if (Integer.bitCount(i) == k) sum += nums.get(i);
        return sum;
    }
}
