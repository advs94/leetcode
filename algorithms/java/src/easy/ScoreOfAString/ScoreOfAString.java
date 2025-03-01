package easy;

public class ScoreOfAString {
    /*
     * LC - 3110. Score of a String
     */
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return score;
    }
}
