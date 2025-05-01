package easy;

public class KeyboardRow {
    /*
     * LC - 500. Keyboard Row
     */
    public String[] findWords(String[] words) {
        final List<String> list = new ArrayList<>();
        final String first = "qwertyuiopQWERTYUIOP", second = "asdfghjklASDFGHJKL", third = "zxcvbnmZXCVBNM";
        for (String word : words) {
            int[] arr = new int[58];
            for (char ch : word.toCharArray()) {
                arr[ch - 'A']++;
            }
            int i = 0;
            for (i = 0; i < 20; i++) {
                if (arr[first.charAt(i) - 'A'] != 0) {
                    break;
                }
            }
            boolean bfirst = i != 20;
            for (i = 0; i < 18; i++) {
                if (arr[second.charAt(i) - 'A'] != 0) {
                    break;
                }
            }
            boolean bsecond = i != 18;
            if (bfirst && bsecond) {
                continue;
            }
            for (i = 0; i < 14; i++) {
                if (arr[third.charAt(i) - 'A'] != 0) {
                    break;
                }
            }
            boolean bthird = i != 14;
            if (bfirst && !bsecond && !bthird || (!bfirst && bsecond && !bthird) || (!bfirst && !bsecond && bthird)) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
