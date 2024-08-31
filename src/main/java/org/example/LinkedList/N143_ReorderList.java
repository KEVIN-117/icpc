package org.example.LinkedList;

import org.example.types.ListNode;

import java.util.List;

public class N143_ReorderList {
    public void reorderList(ListNode head) {

        ListNode dummy = head;
        ListNode middle = findMiddle(dummy);
        ListNode reversed = reversed(middle);
        while (middle != null && reversed != null){
            ListNode temp = dummy.next;
            dummy.next = reversed;
            reversed = reversed.next;
            dummy.next.next = temp;
            dummy = temp;
        }

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reversed(ListNode listNode){
        ListNode prev = null;
        ListNode curr = listNode;
        ListNode next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        N143_ReorderList n143ReorderList = new N143_ReorderList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        n143ReorderList.reorderList(head);
    }
}
