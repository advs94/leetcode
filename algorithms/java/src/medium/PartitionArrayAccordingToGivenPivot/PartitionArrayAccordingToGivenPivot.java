package medium;

public class PartitionArrayAccordingToGivenPivot {
    /*
     * LC - 2161. Partition Array According to Given Pivot
     */
    public int[] pivotArray(int[] nums, int pivot) {
        final int n = nums.length;
        final int[] pivotArr = new int[n];
        int left = 0, right = n-1;
        for (int i = left, j = right; i < n; i++, j--) {
            if (nums[i] < pivot) pivotArr[left++] = nums[i];
            if (nums[j] > pivot) pivotArr[right--] = nums[j];
        }
        for (int i = left; i <= right; i++) pivotArr[i] = pivot;
        return pivotArr;
    }
}
