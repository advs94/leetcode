package easy;

public class SearchInsertPosition {
    /*
     * LC - 35. Search Insert Position
     */
    public int searchInsert(int[] nums, int target) {
        int pos = Arrays.binarySearch(nums, target);
        if (pos < 0) return pos * -1 - 1;
        return pos;
    }
}
