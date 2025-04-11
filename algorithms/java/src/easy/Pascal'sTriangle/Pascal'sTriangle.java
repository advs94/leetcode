package easy;

public class Pascal'sTriangle {
    /*
     * LC - 118. Pascal's Triangle
     */
    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> matrix = new ArrayList<>(numRows);
        matrix.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            final List<Integer> cur = new ArrayList<>(i+1), previous = matrix.get(i-1);
            cur.add(1);
            for (int j = 1; j < i; j++) cur.add(previous.get(j-1) + previous.get(j));
            cur.add(1);
            matrix.add(cur);
        }
        return matrix;
    }
}
