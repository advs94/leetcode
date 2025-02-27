package medium;

public class LengthOfLongestFibonacciSubsequence {
    /*
     * LC - 873. Length of Longest Fibonacci Subsequence
     */
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int first = arr[i];
                int second = arr[j];
                int fib = first + second;
                int length = 2;
                while (set.contains(fib)) {
                    int tmp = fib;
                    fib += second;
                    second = tmp;
                    max = Math.max(max, ++length);
                }
            }
        }
        return max;
    }
}
