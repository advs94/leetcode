package medium;

public class InsertGreatestCommonDivisorsInLinkedList {
    /*
     * LC - 2807. Insert Greatest Common Divisors in Linked List
     */
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.next != null) {
            cur.next = new ListNode(gcd(cur.val, cur.next.val), cur.next);
            cur = cur.next.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
