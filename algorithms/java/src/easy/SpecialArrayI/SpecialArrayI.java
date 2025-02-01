package easy;

public class SpecialArrayI {
    /*
     * LC - 3151. Special Array I
     */
    public boolean isArraySpecial(int[] nums) {
        int cur = nums[0]%2;
        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            prev = cur;
            cur = nums[i]%2;
            if (prev == cur) return false;
        }
        return true;
    }
}
