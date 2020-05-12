package org.thelight1.list;

/**
 * nowcoder pass
 */
public class 链表的入环节点 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null) {
            return null;
        }
        ListNode meetingNode = meetingNode(pHead);
        if (meetingNode == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = meetingNode;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public ListNode meetingNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return fast;
            }
        }
        return null;
    }
}
