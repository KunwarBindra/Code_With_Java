package LinkedList;

// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        ListNode reversePrev = head;
        ListNode reverseCurr = head.next;
        int i = 1;
        while (reverseCurr != null) {
            ListNode reverseNext = reverseCurr.next;
            if (n == 1) {
                head = head.next;
                break;
            }
            if (i == n - 1) {
                reversePrev.next = reverseNext;
                break;
            }
            reversePrev = reverseCurr;
            reverseCurr = reverseNext;
            i++;
        }
        ListNode straightPrev = head;
        ListNode straightCurr = head.next;
        while (straightCurr != null) {
            ListNode straightNext = straightCurr.next;
            straightCurr.next = straightPrev;

            straightPrev = straightCurr;
            straightCurr = straightNext;
        }
        head.next = null;
        head = straightPrev;
        return head;
    }
}
