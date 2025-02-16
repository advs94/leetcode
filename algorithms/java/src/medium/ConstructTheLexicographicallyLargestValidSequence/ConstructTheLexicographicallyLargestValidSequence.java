package medium;

public class ConstructTheLexicographicallyLargestValidSequence {
    /*
     * LC - 1718. Construct the Lexicographically Largest Valid Sequence
     */
    public int[] constructDistancedSequence(int n) {
        int length = n * 2 - 1;
        int[] sequence = new int[length];
        boolean[] used = new boolean[n+1];
        backtrack(sequence, used, n, 0);
        return sequence;
    }

    private boolean backtrack(int[] sequence, boolean[] used, int n, int index) {
        int length = sequence.length;
        if (index == length) return true;
        if (sequence[index] != 0) return backtrack(sequence, used, n, index+1);
        for (int i = n; i > 0; i--) {
            if (used[i]) continue;
            if (i == 1 || (index+i < length && sequence[index+i] == 0)) {
                sequence[index] = i;
                if (i > 1) sequence[index+i] = i;
                used[i] = true;
                if (backtrack(sequence, used, n, index+1)) return true;
                sequence[index] = 0;
                if (i > 1) sequence[index+i] = 0;
                used[i] = false;
            }
        }
        return false;
    }
}
