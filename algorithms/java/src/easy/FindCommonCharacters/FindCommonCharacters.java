package easy;

public class FindCommonCharacters {
    /*
     * LC - 1002. Find Common Characters
     */
    public List<String> commonChars(String[] words) {
        final int[] freq = new int[26];
        for (char ch : words[0].toCharArray()) freq[ch - 'a']++;
        for (int i = 1; i < words.length; i++) {
            final int[] tmp = new int[26];
            for (char ch : words[i].toCharArray()) tmp[ch - 'a']++;
            for (int j = 0; j < 26; j++) freq[j] = Math.min(freq[j], tmp[j]);
        }
        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i]; j++) {
                list.add(String.valueOf((char) (i + 'a')));
            }
        }
        return list;
    }
}
