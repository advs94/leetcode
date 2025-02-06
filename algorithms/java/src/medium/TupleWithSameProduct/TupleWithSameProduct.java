package medium;

public class TupleWithSameProduct {
    /*
     * LC - 1726. Tuple with Same Product
     */
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        Map<Integer, Integer> products = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int product = nums[i]*nums[j];
                products.merge(product, 1, Integer::sum);
            }
        }
        for (int freq : productFreq.values()) {
            if (freq > 1) {
                count += freq * (freq - 1) * 4;
            }
        }
        return count;
    }
}
