package easy;

public class SplitStringsBySeparator {
    /*
     * LC - 2788. Split Strings by Separator
     */
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        final List<String> ans = new ArrayList<>();
        for (String word : words) {
            char[] ch = word.toCharArray();
            int j = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == separator) {
                    if (i != j) {
                        ans.add(new String(ch, j, i-j));
                    }
                    j = i+1;
                }
            }
            if (j != ch.length) {
                ans.add(new String(ch, j, ch.length-j));
            }
        }
        return ans;
    }
}
