package medium;

public class FindUniqueBinaryString {
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
