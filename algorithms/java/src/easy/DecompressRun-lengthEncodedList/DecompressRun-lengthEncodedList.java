package easy;

public class DecompressRun-lengthEncodedList {
    /*
     * LC - 1313. Decompress Run-Length Encoded List
     */
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i+=2) n += nums[i];
        final int[] decompressedList = new int[n];
        int index = 0;
        for (int i = 0; i < nums.length; i+=2) {
            Arrays.fill(decompressedList, index, index + nums[i], nums[i+1]);
            index += nums[i];
        }
        return decompressedList;
    }
}
