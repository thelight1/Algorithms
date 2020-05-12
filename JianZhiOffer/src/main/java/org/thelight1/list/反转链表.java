package org.thelight1.list;

/**
 * nowcoder pass
 */
public class 反转链表 {

    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode s = null;
        ListNode curr = null;
        while (head.next != null) {
             curr = head;
             head = head.next;
             curr.next = s;
             s = curr;
        }
        head.next = s;
        return head;
    }
}
