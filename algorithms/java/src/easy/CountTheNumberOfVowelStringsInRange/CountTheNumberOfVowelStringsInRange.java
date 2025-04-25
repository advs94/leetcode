package easy;

public class CountTheNumberOfVowelStringsInRange {
    /*
     * LC - 2586. Count the Number of Vowel Strings in Range
     */
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length()-1);
            if (isVowel(first) && isVowel(last)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
        }
        return false;
    }
}
