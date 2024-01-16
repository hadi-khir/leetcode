package org.personal.leetcode.easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode preHead = new ListNode();
        ListNode mergedList = preHead;
        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {

                mergedList.next = list2;
                list2 = list2.next;
            } else {

                mergedList.next = list1;
                list1 = list1.next;
            }

            mergedList = mergedList.next;
        }

        if (list1 != null) {
            mergedList.next = list1;
        } else {
            mergedList.next = list2;
        }

        return preHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
