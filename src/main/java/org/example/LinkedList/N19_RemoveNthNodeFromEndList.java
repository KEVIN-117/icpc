package org.example.LinkedList;

import org.example.types.ListNode;

public class N19_RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode current = head;
        for (int i = 0; i < getLength(head) - n; i++) {
            prev = current;
            current = current.next;
        }
        if (prev == null)
            return head.next;
        prev.next = current.next;
        return head;
    }

    public int getLength(ListNode head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        N19_RemoveNthNodeFromEndList n19_removeNthNodeFromEndList = new N19_RemoveNthNodeFromEndList();

        ListNode head = new ListNode(1);
        /*ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;*/

        ListNode res = n19_removeNthNodeFromEndList.removeNthFromEnd(head, 2);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
