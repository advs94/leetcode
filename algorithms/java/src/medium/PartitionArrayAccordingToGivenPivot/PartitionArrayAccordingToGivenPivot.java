package medium;

public class PartitionArrayAccordingToGivenPivot {
    /*
     * LC - 2161. Partition Array According to Given Pivot
     */
    public int[] pivotArray(int[] nums, int pivot) {
        final int n = nums.length;
        final int[] headArr = new int[n], pivotArr = new int[n], tailArr = new int[n];
        int headCount = 0, pivotCount = 0, tailCount = 0;
        for (int num : nums) {
            if (num < pivot) headArr[headCount++] = num;
            else if (num == pivot) pivotArr[pivotCount++] = num;
            else tailArr[tailCount++] = num;
        }
        System.arraycopy(pivotArr, 0, headArr, headCount, pivotCount);
        System.arraycopy(tailArr, 0, headArr, headCount + pivotCount, tailCount);
        return headArr;
    }
}
