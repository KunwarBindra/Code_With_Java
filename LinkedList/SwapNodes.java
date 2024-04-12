package LinkedList;

// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Example 1:

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
// Example 2:

// Input: head = []
// Output: []
// Example 3:

// Input: head = [1]
// Output: [1]

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        int i = 1;
        while (currNode != null) {
            ListNode nextNode = currNode.next;
            if (i % 2 != 0) {
                currNode.next = prevNode;
                if (nextNode != null) {
                    if (nextNode.next != null) {
                        prevNode.next = nextNode.next;
                    } else {
                        prevNode.next = nextNode;
                    }
                } else {
                    prevNode.next = nextNode;
                }
                if (i == 1) {
                    head = currNode;
                }
            } else {
                prevNode = currNode;
            }
            currNode = nextNode;
            i++;
        }
        return head;
    }
}
