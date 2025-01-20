package medium;

public class NeighboringBitwiseXOR {
    /*
     * LC - 2683. Neighboring Bitwise XOR
     */
    public boolean doesValidArrayExist(int[] derived) {
        int xorSum = 0;
        for (int i : derived) xorSum ^= i; // Compute XOR of all elements in the array
        return xorSum == 0; // Return true if XOR sum is 0, indicating a valid array
    }
}
