package medium;

public class TheK-thLexicographicalStringOfAllHappyStringsOfLengthN {
    /*
     * LC - 1415. The k-th Lexicographical String of All Happy Strings of Length n
     */
    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<String> happy = new ArrayList<>();
        dfs(sb, happy, n);
        return happy.size() >= k ? happy.get(k-1) : "";
    }

    private void dfs(StringBuilder sb, List<String> happy, int n) {
        if (sb.length() == n) {
            happy.add(sb.toString());
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (sb.length() > 0 && sb.charAt(sb.length()-1) == (char)('a'+i)) continue;
            dfs(sb.append((char)('a'+i)), happy, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
