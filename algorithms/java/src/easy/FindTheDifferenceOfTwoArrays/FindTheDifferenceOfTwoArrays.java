package easy;

public class FindTheDifferenceOfTwoArrays {
    /*
     * LC - 2215. Find the Difference of Two Arrays
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        final Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        final List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        return Arrays.asList(list1, list2);
    }
}
