/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> lr = new ArrayList();
       
        p(lr, root);
        return lr;
    }
    
   void p(List<Integer> lr,Node root) {
        if(root== null) {
            return; 
        }
         lr.add(root.val);
       
      for(Node nn : root.children){
          p(lr, nn); 
      }
   }
}