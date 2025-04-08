package easy;

public class BaseballGame {
    /*
     * LC - 682. Baseball Game
     */
    public int calPoints(String[] operations) {
        int left = 0, right = 0;
        for (int i = 0; i < operations.length; i++) {
            char operation = operations[i].charAt(0);
            if (operation == 'C') {
                right--;
                if (left != 0) {
                    left--;
                }
            } else if (operation == '+') {
                operations[right++] = String.valueOf(Integer.parseInt(operations[left]) + Integer.parseInt(operations[left+++1]));
            } else if (operation == 'D') {
                operations[right] = String.valueOf(Integer.parseInt(operations[right++-1]) * 2);
            } else {
                operations[right++] = operations[i];
            }
            if (left + 3 == right) left++;
        }
        int sum = 0;
        for (int i = 0; i < right; i++) sum += Integer.parseInt(operations[i]);
        return sum;
    }
}
