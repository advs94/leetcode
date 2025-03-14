package easy;

public class TheTwoSneakyNumbersOfDigitville {
    /*
     * LC - 3289. The Two Sneaky Numbers of Digitville
     */
    public int[] getSneakyNumbers(int[] nums) {
        final int[] snum = new int[2];
        final int[] freq = new int[nums.length-2];
        int index = 0;
        for (int num : nums) {
            if (++freq[num] == 2) {
                snum[index++] = num;
            }
        }
        return snum;
    }
}
