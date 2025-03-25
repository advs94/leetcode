package easy;

public class SortThePeople {
    /*
     * LC - 2418. Sort the People
     */
    public String[] sortPeople(String[] names, int[] heights) {
        quickSort(heights, 0, heights.length-1, names);
        return names;
    }

    private void quickSort(int[] arr, int low, int high, String[] strArr) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, strArr);
            quickSort(arr, low, pivotIndex - 1, strArr);
            quickSort(arr, pivotIndex + 1, high, strArr);
        }
    }

    private int partition(int[] arr, int low, int high, String[] strArr) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) if (arr[j] >= pivot) swap(arr, ++i, j, strArr);
        swap(arr, i+1, high, strArr);
        return i+1;
    }

    private void swap(int[] arr, int i, int j, String[] strArr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        String strTemp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = strTemp;
    }
}
