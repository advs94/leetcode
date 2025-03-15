package easy;

public class ShuffleTheArray {
    /*
     * LC - 1470. Shuffle the Array
     */
    public int[] shuffle(int[] nums, int n) {
        final int[] shuffled = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i+=2, j++) {
            shuffled[i] = nums[j];
            shuffled[i+1] = nums[n+j];
        }
        return shuffled;
    }
}
