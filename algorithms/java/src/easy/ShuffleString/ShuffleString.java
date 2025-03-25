package easy;

public class ShuffleString {
    /*
     * LC - 1528. Shuffle String
     */
    public String restoreString(String s, int[] indices) {
        final char[] arr = s.toCharArray();
        final int n = indices.length;
        final char[] ans = new char[n];
        for (int i = 0; i < n; i++) ans[indices[i]] = arr[i];
        return new String(ans);
    }
}
