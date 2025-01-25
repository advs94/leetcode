package easy;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    /*
     * LC - 21. Merge Two Sorted Lists
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2; // If list1 is null, return list2
        if (list2 == null) return list1; // If list2 is null, return list1
        ListNode start = null; // Start of the merged list
        if (list1.val > list2.val) { // Determine the starting node
            start = list2;
            list2 = list2.next;
        } else {
            start = list1;
            list1 = list1.next;
        }
        ListNode current = start; // Pointer to traverse the merged list
        while (list1 != null && list2 != null) { // Traverse both lists
            if (list1.val > list2.val) { // Compare values and merge
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next; // Move to the next node
        }
        current.next = list1 != null ? list1 : list2; // Append remaining nodes
        return start; // Return the merged list
    }
}
