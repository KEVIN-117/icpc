package org.example.LinkedList;

import org.example.types.ListNode;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();

        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode res = middleLinkedList.middleNode(head);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}

class Pointer{
    public int counter;
    public ListNode current;


    public Pointer(int counter, ListNode current){
        this.counter = counter;
        this.current = current;
    }

    Pointer moveNext(){
        if (current.next != null){
            current = current.next;
            counter++;
        }
        return this;
    }
}