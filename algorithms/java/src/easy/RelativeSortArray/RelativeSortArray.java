package easy;

public class RelativeSortArray {
    /*
     * LC - 1122. Relative Sort Array
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        final int[] freq = new int[1001];
        for (int num : arr1) freq[num]++;
        int index = 0;
        for (int num : arr2) {
            for (int i = 0; i < freq[num]; i++) {
                arr1[index++] = num;
            }
            freq[num] = 0;
        }
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < freq[i]; j++) {
                arr1[index++] = i;
            }
        }
        return arr1;
    }
}
