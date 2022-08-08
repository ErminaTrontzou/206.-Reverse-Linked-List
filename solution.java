/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    if (head == null) {
         return head;
     }
        ListNode copy = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next=copy;
            copy=head;
            head=temp;
        }
        return copy;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
// Memory Usage: 43.4 MB, less than 21.25% of Java online submissions for Reverse Linked List.
