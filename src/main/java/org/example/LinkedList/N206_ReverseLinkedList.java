package org.example.LinkedList;

import org.example.types.ListNode;

public class N206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        N206_ReverseLinkedList n206_reverseLinkedList = new N206_ReverseLinkedList();

        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode res = n206_reverseLinkedList.reverseList(head);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
