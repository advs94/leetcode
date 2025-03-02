package easy;

public class ConcatenationOfArray {
    /*
     * LC - 1929. Concatenation of Array
     */
    public int[] getConcatenation(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[2*n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }

    /*
     * LC - 1980. Find Unique Binary String
     */
public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        return dfs(sb, nums);
    }

    private static String dfs(StringBuilder sb, String[] nums) {
        if (sb.length() == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i].compareTo(sb.toString()) == 0) {
                    return null;
                }
            }
            return sb.toString();
        }
        for (int i = 0; i < 2; i++) {
            String unique = dfs(sb.append((char)('0'+i)), nums);
            if (unique != null) return unique;
            sb.deleteCharAt(sb.length()-1);
        }
        return null;
    }
}
