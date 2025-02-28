package hard;

public class ShortestCommonSupersequence {
    /*
     * LC - 1092. Shortest Common Supersequence
     */
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        String[] prev = new String[m+1];
        for (int j = 0; j < m; j++) {
            prev[j] = str2.substring(j);
        }
        prev[m] = "";
        for (int i = n-1; i >= 0; i--) {
            String[] cur = new String[m+1];
            Arrays.fill(cur, "");
            cur[m] = str1.substring(i);
            for (int j = m-1; j >= 0; j--) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    cur[j] = str1.charAt(i) + prev[j+1];
                } else {
                    String res1 = str1.charAt(i) + prev[j];
                    String res2 = str2.charAt(j) + cur[j+1];
                    if (res1.length() < res2.length()) cur[j] = res1;
                    else cur[j] = res2;
                }
            }
            prev = cur;
        }
        return prev[0];
    }
}
