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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = head.next;
        
        int i = 1;
       
        while(p1.next != null) {
            p1 = p1.next;
            i++;
        }
        
        k =   k % i;
        if(k == 0) {
            return head;
        }
    
        k = i - k;
        while( k > 1) {
            
            p3 = p3.next;
            p2 = p2.next;
            k--;            
        }
        
        
        p1.next = head;
        head = p3;
        p2.next = null;
        
        return head;
        
    }
}