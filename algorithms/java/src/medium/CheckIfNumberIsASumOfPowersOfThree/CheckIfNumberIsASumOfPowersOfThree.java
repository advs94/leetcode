package medium;

public class CheckIfNumberIsASumOfPowersOfThree {
    /*
     * LC - 1780. Check if Number is a Sum of Powers of Three
     */
    public boolean checkPowersOfThree(int n) {
        return !Integer.toString(n, 3).contains("2");
    }
}
