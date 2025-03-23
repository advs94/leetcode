package medium;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    /*
     * LC - 1282. Group the People Given the Group Size They Belong To
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        final List<List<Integer>> groupedPeople = new ArrayList<>();
        final Map<Integer, List<Integer>> map = new HashMap<>();
        final int n = groupSizes.length;
        for (int i = 0; i < n; i++) {
            List<Integer> tmp = map.getOrDefault(groupSizes[i], new ArrayList<>());
            tmp.add(i);
            if (tmp.size() == groupSizes[i]) {
                groupedPeople.add(tmp);
                map.remove(groupSizes[i]);
            } else {
                map.put(groupSizes[i], tmp);
            }
        }
        return groupedPeople;
    }
}
