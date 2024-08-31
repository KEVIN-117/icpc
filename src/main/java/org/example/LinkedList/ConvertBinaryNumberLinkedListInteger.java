package org.example.LinkedList;

import org.example.types.ListNode;

import java.util.Arrays;

public class ConvertBinaryNumberLinkedListInteger {
                                //0  0  0  0  0   0   1   1    1    0    0     1     0     0     1
    static final int[] NUMBERS = {536870912, 268435456, 134217728, 67108864, 33554432, 16777216, 8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    public int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null){
            builder.append(head.val);
            head = head.next;
        }
        int len = builder.length();
        int[] comparator = getSubArray(len);
        System.out.println(Arrays.toString(comparator));
        int result = 0;

        for (int i = 0; i < comparator.length; i++) {
            //System.out.println(builder.charAt(i));
            if (builder.charAt(i) == '1')
                result += comparator[i];
        }
        return result;
    }

    public static int[] getSubArray(int limit){
        return Arrays.copyOfRange(NUMBERS, NUMBERS.length-limit, NUMBERS.length);
    }

    public static void main(String[] args) {
        ConvertBinaryNumberLinkedListInteger listInteger = new ConvertBinaryNumberLinkedListInteger();
        // [,0,0,1,1,1,0,0,0,0,0,0]
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        /*ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(0);
        ListNode n5 = new ListNode(0);
        ListNode n6 = new ListNode(1);
        ListNode n7 = new ListNode(1);
        ListNode n8 = new ListNode(1);
        ListNode n9 = new ListNode(0);
        ListNode n10 = new ListNode(0);
        ListNode n11 = new ListNode(0);
        ListNode n12 = new ListNode(0);
        ListNode n13 = new ListNode(0);
        ListNode n14 = new ListNode(0);*/
        head.next = n1;
        n1.next = n2;
        /*n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;*/
        System.out.println(listInteger.getDecimalValue(head));

    }
}

