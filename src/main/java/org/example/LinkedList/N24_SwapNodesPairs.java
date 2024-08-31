package org.example.LinkedList;

import org.example.types.ListNode;

public class N24_SwapNodesPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;
        ListNode sw1 = point;
        ListNode sw2 = point;
        while (sw1.next != null && sw2.next.next != null){
            sw1 = point.next;
            sw2 = point.next.next;
            sw1.next = sw2.next;
            sw2.next = sw1;
            point.next = sw2;
            point = sw1;
        }

        return dummy.next;
    }
}
