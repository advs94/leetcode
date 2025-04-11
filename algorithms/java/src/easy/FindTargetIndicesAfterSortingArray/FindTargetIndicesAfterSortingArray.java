package easy;

public class FindTargetIndicesAfterSortingArray {
    /*
     * LC - 2089. Find Target Indices After Sorting Array
     */
    public List<Integer> targetIndices(int[] nums, int target) {
        int freq = 0, start = 0;
        for (int num : nums) {
            if (num == target) freq++;
            else if (num < target) start++;
        }
        final List<Integer> indices = new ArrayList<>();
        for (int i = start; i < start + freq; i++) indices.add(i);
        return indices;
    }
}
