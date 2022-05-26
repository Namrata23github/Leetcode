/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       
       Map<Node, Node> map = new HashMap();
        Node p2 = head;
        while(p2!= null && p2.next!= null) {
            map.put(p2, new Node(p2.val));
             map.put(p2.next, new Node(p2.next.val));
            p2 = p2.next.next;
        }
        
        if(p2!=null) {
             map.put(p2, new Node(p2.val));
        }
        Node p1 = head;
        
         while (p1!= null) {
             Node n11 = map.get(p1);
             n11.next = map.get(p1.next);
             n11.random = map.get(p1.random);
             p1 = p1.next;
          

         }
        
        return map.get(head);
    }
    
    
    
  
    
 
}