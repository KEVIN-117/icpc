package org.example.LinkedList;

import org.example.types.ListNode;

public class N234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode middleNode = revertLinkedList(searchMiddleNode(head));
        return comparator(head, middleNode);
    }

    public ListNode searchMiddleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast  != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode revertLinkedList(ListNode head) {
        ListNode actual = head;
        ListNode prev = null;

        while (actual != null) {
            ListNode aux = actual.next;
            actual.next = prev;
            prev = actual;
            actual = aux;
        }
        return prev;
    }

    public boolean comparator(ListNode head, ListNode  middle) {
        boolean validator = true;
        while (validator && head != null && middle != null) {
            if (head.val != middle.val) {
                validator = false;
            }
            head = head.next;
            middle = middle.next;
        }
        return validator;
    }
}
