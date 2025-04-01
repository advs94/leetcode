package easy;

public class KthDistinctStringInAnArray {
    /*
     * LC - 2053. Kth Distinct String in an Array
     */
    public String kthDistinct(String[] arr, int k) {
        final Map<String, Boolean> map = new LinkedHashMap<>();
        for (String str : arr) {
            if (!map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }
        int i = 1;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getValue() && k == i++) {
                return entry.getKey();
            }
        }
        return "";
    }
}
