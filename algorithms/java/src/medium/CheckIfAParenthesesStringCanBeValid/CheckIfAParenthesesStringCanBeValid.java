package medium;

public class CheckIfAParenthesesStringCanBeValid {
    /*
     * LC - 2116. Check if a Parentheses String Can Be Valid
     */
    public boolean canBeValid(String s, String locked) {
        // Step 1: Check if the length of the string is odd
        if (locked.length() % 2 != 0) return false;
        int openParenthesis = 0;
        int unlockedIndex = 0;
        // Step 2: Traverse the string from left to right
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') unlockedIndex++; // If the current character is unlocked
            else if (s.charAt(i) == '(') openParenthesis++; // Increment open parenthesis count
            else if (openParenthesis > 0) openParenthesis--; // Close a previously opened parenthesis
            else if (unlockedIndex > 0) unlockedIndex--; // Use an unlocked position to balance else {
            else return false; // If none of the conditions are met, return false
        }
        int closeParenthesis = 0;
        unlockedIndex = 0;
        // Step 3: Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') unlockedIndex++; // If the current character is unlocked
            else if (s.charAt(i) == ')') closeParenthesis++; // Increment close parenthesis count
            else if (closeParenthesis > 0) closeParenthesis--; // Close a previously opened parenthesis
            else if (unlockedIndex > 0) unlockedIndex--; // Use an unlocked position to balance
            else return false; // If none of the conditions are met, return false
        }
        // Step 4: Return true if all checks are passed
        return true;
    }
}
