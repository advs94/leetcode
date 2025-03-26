package easy;

public class NumberOfArithmeticTriplets {
    /*
     * LC - 2367. Number of Arithmetic Triplets
     */
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        final Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        for (int num : nums) {
            if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }
}
