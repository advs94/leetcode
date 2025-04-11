package easy;

public class CountNegativeNumbersInASortedMatrix {
    /*
     * LC - 1351. Count Negative Numbers in a Sorted Matrix
     */
    public int countNegatives(int[][] grid) {
        final int n = grid[0].length;
        int count = 0;
        for (int[] arr : grid) count += n - binarySearchDescending(arr, -1);
        return count;
    }

    private static int binarySearchDescending(int[] arr, int key) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res == -1 ? left : res;
    }
}
