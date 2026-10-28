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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        if (head == null){
            return null;
        }

        for (int i=0; i<k; i++){
            if (tail == null){
                return head;
            }
            tail = tail.next;
        }
        
        ListNode newH = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newH;
    }
    private ListNode reverse (ListNode curr, ListNode end){
        ListNode prev = null;

        while (curr != end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
}