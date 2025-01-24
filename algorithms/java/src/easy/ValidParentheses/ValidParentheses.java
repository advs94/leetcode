package easy;

public class ValidParentheses {
    /*
     * LC - 20. Valid Parentheses
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false; // If the length is odd, it's not valid
        char[] depthArr = new char[s.length()]; // Array to track unmatched opening brackets
        int depth = 0; // Depth index for tracking the stack
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Current character
            if (c == '(' || c == '{' || c == '[') depthArr[depth++] = c; // Push opening bracket to the stack
            else if (depth == 0 || depthArr[--depth] != c - (c == ')' ? 1 : 2)) return false; // If stack is empty or mismatch occurs, return false
        }
        return depth == 0; // If stack is empty, it's valid
    }
}
