package easy;

public class CountItemsMatchingARule {
    /*
     * LC - 1773. Count Items Matching a Rule
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index = 0;
        if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;
        for (List<String> item : items) if (item.get(index).equals(ruleValue)) count++;
        return count;
    }
}
