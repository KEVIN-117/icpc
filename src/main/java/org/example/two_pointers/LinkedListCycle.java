package org.example.two_pointers;

import org.example.ListNode;

import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println(linkedListCycle.hasCycle(head));
    }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            if (fast.next == slow)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
