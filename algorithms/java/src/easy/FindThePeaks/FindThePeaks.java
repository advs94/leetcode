package easy;

public class FindThePeaks {
    /*
     * LC - 2951. Find the Peaks
     */
    public List<Integer> findPeaks(int[] mountain) {
        final List<Integer> list = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) {
                list.add(i);
            }
        }
        return list;
    }
}
