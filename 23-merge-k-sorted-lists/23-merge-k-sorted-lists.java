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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists == null || lists.length < 1) {
            return null;
        }
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode> ((a, b) ->  {
                if( a.val > b.val)
                    return 1;
                else 
                    return -1;
            }
        );
        
        for(int i = 0; i < lists.length; i++) {
            
            ListNode root = lists[i];
            while(root!=null) {
                queue.add(root);
                root = root.next;
                
            }
        }
        
        ListNode head = queue.poll();
        ListNode p = head;
        
        while(!queue.isEmpty()) {
         ListNode node = queue.poll();
            node.next = null;
            p.next =   node;
            p = p.next;
        }
        
        return head;
        
        
        
    }
}