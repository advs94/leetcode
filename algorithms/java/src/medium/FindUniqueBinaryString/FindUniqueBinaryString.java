package medium;

public class FindUniqueBinaryString {
    /*
     * LC - 1980. Find Unique Binary String
     */
    public String findDifferentBinaryString(String[] nums) {
        final int n = nums.length;
        char[] result = new char[n];
        for (int i = 0; i < n; i++) result[i] = (char) (nums[i].charAt(i) ^ 1);
        return new String(result);
    }
}
