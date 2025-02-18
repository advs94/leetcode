package medium;

public class ConstructSmallestNumberFromDiString {
    /*
     * LC - 2375. Construct Smallest Number From DI String
     */
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        char[] num = new char[n+1];
        boolean[] used = new boolean[10];
        for (int i = 1; i <= 9; i++) {
            num[0] = (char) (i + '0');
            used[i] = true;
            if (dfs(num, used, pattern, 1)) {
                return new String(num);
            }
            num[0] = '0';
            used[i] = false;
        }
        return null;
    }

    private boolean dfs (char[] num, boolean[] used, String pattern, int i) {
        int n = pattern.length();
        if (i == n+1) return true;
        int previous = i == 0 ? 0 : num[i-1] - '0';
        if (pattern.charAt(i-1) == 'I') {
            if (previous + 1 > 9) return false;
            for (int j = previous + 1; j <= 9; j++) {
                if (!used[j]) {
                    used[j] = true;
                    num[i] = (char) (j + '0');
                    if (dfs(num, used, pattern, i+1)) return true;
                    used[j] = false;
                    num[i] = '0';
                }
            }
        } else if (pattern.charAt(i-1) == 'D') {
            if (previous - 1 < 1) return false;
            for (int j = previous - 1; j >= 1; j--) {
                if (!used[j]) {
                    used[j] = true;
                    num[i] = (char) (j + '0');
                    if (dfs(num, used, pattern, i+1)) return true;
                    used[j] = false;
                    num[i] = '0';
                }
            }
        }
        return false;
    }
}
