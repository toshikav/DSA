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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null ||head.next.next == null){
            return new int[]{-1,-1} ;
        }
        List<Integer> ans = new ArrayList<>();
        int pos = 1;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;
    

        while(next != null){
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val <next.val)){
                    ans.add(pos);
                }
                prev = curr;
                curr = next;
                next = next.next;
                pos++;           
            }
            if (ans.size() < 2){
                return new int[]{-1,-1};
            }
            
            int min = Integer.MAX_VALUE;
            for (int i=1; i<ans.size(); i++){
                min = Math.min( min , ans.get(i) - ans.get(i-1));
            }

            int max = ans.get(ans.size() - 1 ) - ans.get(0);

        return new int[]{min,max} ;      
        
    }
}