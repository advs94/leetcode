package easy;

public class DeleteColumnsToMakeSorted {
    /*
     * LC - 944. Delete Columns to Make Sorted
     */
    public int minDeletionSize(String[] strs) {
        final int len = strs[0].length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int max = 97;
            for (String str : strs) {
                final int val = str.charAt(i);
                if (val < max) {
                    count++;
                    break;
                }
                max = val;
            }
        }
        return count;
    }
}
