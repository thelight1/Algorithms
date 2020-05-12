package org.thelight1.list;

/**
 * 思路：
 * 1）求两个链表的长度len1, len2，求出长度差diff
 * 2）长度长的先走diff步，然后一起走,判断是否为同一个节点
 *
 * nowcoder pass
 */
public class 链表的第一个公共节点 {

    public ListNode FindFirstCommonNode(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return null;
        }

        int len1 = getListLength(head1);
        int len2 = getListLength(head2);

        ListNode longhead = head1;
        ListNode shorthead = head2;
        int diff = Math.abs(len1 - len2);
        if (len1 < len2) {
            longhead = head2;
            shorthead = head1;
        }

        for (int i = 0; i < diff; i++) {
            longhead = longhead.next;
        }

        while (longhead != null && shorthead != null && longhead != shorthead) {
            longhead = longhead.next;
            shorthead = shorthead.next;
        }

        return longhead;
    }

    public int getListLength(ListNode head) {
        int len = 1;
        while (head.next != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
