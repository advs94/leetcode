package easy;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    /*
     * LC - 1967. Number of Strings That Appear as Substrings in Word
     */
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
