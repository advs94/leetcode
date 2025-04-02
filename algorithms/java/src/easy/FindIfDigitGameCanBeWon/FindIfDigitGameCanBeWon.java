package easy;

public class FindIfDigitGameCanBeWon {
    /*
     * LC - 3232. Find if Digit Game Can Be Won
     */
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0, doubleDigit = 0;
        for (int num : nums) {
            if (num < 10) singleDigit += num;
            else doubleDigit += num;
        }
        return singleDigit != doubleDigit;
    }
}
