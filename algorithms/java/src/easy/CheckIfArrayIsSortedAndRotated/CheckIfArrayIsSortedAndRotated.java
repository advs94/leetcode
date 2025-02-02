package easy;

public class CheckIfArrayIsSortedAndRotated {
    /*
     * LC - 1752. Check if Array Is Sorted and Rotated
     */
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        int dropCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i+1)%n]) dropCount++;
        }
        return dropCount <= 1;
    }
}
