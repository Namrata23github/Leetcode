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
        Node p1 = head;
        while(p1!= null && p1.next!= null) {
            map.put(p1, new Node(p1.val));
             map.put(p1.next, new Node(p1.next.val));
            p1 = p1.next.next;
        }
        
        if(p1!=null) {
             map.put(p1, new Node(p1.val));
        }
         p1 = head;
        
         while (p1!= null) {
             Node n11 = map.get(p1);
             n11.next = map.get(p1.next);
             n11.random = map.get(p1.random);
             p1 = p1.next;
          

         }
        
        return map.get(head);
    }
    
    
    
  
    
 
}