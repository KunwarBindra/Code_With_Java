package LinkedList;

// Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

 

// Example 1:


// Input: head = [1,2,3,4,5], left = 2, right = 4
// Output: [1,4,3,2,5]
// Example 2:

// Input: head = [5], left = 1, right = 1
// Output: [5]

class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode newHead(ListNode head, int left, int size) {
        ListNode curr = head;
        int i = 1;
        while (i <= size) {
            if (i == left) {
                break;
            }
            curr = curr.next;
            i++;
        }
        return curr;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        ListNode start = newHead(head, left, size);
        ListNode reversePrev = start;
        ListNode reverseCurr = start.next;
        int si = left;
        while (si < right) {
            ListNode reverseNext = reverseCurr.next;
            reverseCurr.next = reversePrev;
            reversePrev = reverseCurr;
            reverseCurr = reverseNext;
            si++;
        }
        start.next = reverseCurr;
        start = reversePrev;
        if (left - 1 < 1) {
            return start;
        }
        ListNode begin = head;
        int j = 1;
        while (j < left - 1) {
            begin = begin.next;
            j++;
        }
        begin.next = start;
        return head;
    }
}
