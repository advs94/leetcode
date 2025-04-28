package easy;

public class PointsThatIntersectWithCars {
    /*
     * LC - 2848. Points That Intersect With Cars
     */
    public int numberOfPoints(List<List<Integer>> nums) {
        final boolean[] arr = new boolean[101];
        for (List<Integer> list : nums) {
            for (int i = list.get(0); i <= list.get(1); i++) {
                arr[i] = true;
            }
        }
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (arr[i]) {
                sum++;
            }
        }
        return sum;
    }
}
