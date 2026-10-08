package com.leetcode.medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return sumListNode(l1, l2, 0);
    }

    private ListNode sumListNode(ListNode l1, ListNode l2, int acc) {
        if (l1 == null && l2 == null) {
            return (acc == 0) ? null : new ListNode(acc, null);
        }

        int a = 0;
        int b = 0;
        if (l1 != null) {
            a = l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            b = l2.val;
            l2 = l2.next;
        }

        int sum = a + b + acc;
        acc = sum / 10;

        return new ListNode(sum % 10, sumListNode(l1, l2, acc));
    }
}
