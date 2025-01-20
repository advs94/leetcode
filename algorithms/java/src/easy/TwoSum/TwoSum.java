package easy;

public class TwoSum {
    /*
     * LC - 1. Two Sum
     */
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                twoSum[0] = i;
                twoSum[1] = map.get(complement);
                return twoSum; // Return the indices of the two numbers that add up to the target
            }
            map.put(nums[i], i); // Store the index of the current number in the map
        }
        return twoSum; // Return the result (will be an empty array if no solution found)
    }
}
