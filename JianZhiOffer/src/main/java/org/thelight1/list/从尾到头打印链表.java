package org.thelight1.list;

import java.util.ArrayList;

/**
 * nocoder pass
 */
public class 从尾到头打印链表 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null) {
            return ret;
        }
        fromTailToHead(listNode, ret);
        return ret;
    }

    public void fromTailToHead(ListNode listNode, ArrayList<Integer> list) {
        if (listNode != null) {
            fromTailToHead(listNode.next, list);
            list.add(listNode.val);
        }
    }
}
