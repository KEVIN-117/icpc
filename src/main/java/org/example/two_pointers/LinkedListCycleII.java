package org.example.two_pointers;

import org.example.ListNode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        LinkedListCycleII linkedListCycle = new LinkedListCycleII();
        System.out.println(linkedListCycle.detectCycle(head).val);

        //int[] nodes = {-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5};
        ListNode head2 = new ListNode(-21);
        ListNode node4 = new ListNode(10);
        ListNode node5 = new ListNode(17);
        ListNode node6 = new ListNode(8);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(26);
        ListNode node9 = new ListNode(5);
        ListNode node10 = new ListNode(35);
        ListNode node11 = new ListNode(33);
        ListNode node12 = new ListNode(-7);
        ListNode node13 = new ListNode(-16);
        ListNode node14 = new ListNode(27);
        ListNode node15 = new ListNode(-12);
        ListNode node16 = new ListNode(6);
        ListNode node17 = new ListNode(29);
        ListNode node18 = new ListNode(-12);
        ListNode node19 = new ListNode(5);
        ListNode node20 = new ListNode(9);
        ListNode node21 = new ListNode(20);
        ListNode node22 = new ListNode(14);
        ListNode node23 = new ListNode(14);
        ListNode node24 = new ListNode(2);
        ListNode node25 = new ListNode(13);
        ListNode node26 = new ListNode(-24);
        ListNode node27 = new ListNode(21);
        ListNode node28 = new ListNode(23);
        ListNode node29 = new ListNode(-21);
        ListNode node30 = new ListNode(5);

        head2.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;
        node17.next = node18;
        node18.next = node19;
        node19.next = node20;
        node20.next = node21;
        node21.next = node22;
        node22.next = node23;
        node23.next = node24;
        node24.next = node25;
        node25.next = node26;
        node26.next = node27;
        node27.next = node28;
        node28.next = node29;
        node29.next = node30;
        node30.next = node17;
        System.out.println(linkedListCycle.detectCycle(head2).val);

    }
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                ListNode pointer1 = head;
                ListNode pointer2 = slow;
                while (pointer1 != pointer2){
                    pointer1 = pointer1.next;
                    pointer2 = pointer2.next;
                }
                return pointer1;
            }
        }
        return null;
    }
}
