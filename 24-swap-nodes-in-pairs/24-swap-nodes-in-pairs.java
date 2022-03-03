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
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(-1);
        ListNode c = head;
        ListNode n = d;
        
        d.next = head;
        
       while(c!=null && c.next!=null) {
           n.next = c.next;
           c.next = c.next.next;
           n.next.next = c;
           c = c.next;
           n = n.next.next;
       }
        
        return d.next;
    }
}