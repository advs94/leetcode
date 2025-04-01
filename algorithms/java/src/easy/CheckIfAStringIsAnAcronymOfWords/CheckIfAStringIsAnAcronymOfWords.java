package easy;

public class CheckIfAStringIsAnAcronymOfWords {
    /*
     * LC - 2828. Check if a String Is an Acronym of Words
     */
    public boolean isAcronym(List<String> words, String s) {
        final int n = words.size();
        if (n != s.length()) return false;
        for (int i = 0; i < n; i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
