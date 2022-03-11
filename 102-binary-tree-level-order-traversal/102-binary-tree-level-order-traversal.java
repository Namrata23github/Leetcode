/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
         List<List<Integer>> result = new ArrayList();
       Queue<TreeNode> queue = new LinkedList<>();
        if(root== null) {
            return result;
        }

        queue.offer(root);
        levelOrder(result,queue );
        return result;
    }
    
    public void levelOrder ( List<List<Integer>> result, Queue<TreeNode> queue ) {
        
       while(queue.size() > 0) {
           int qsize = queue.size();
           List<Integer> b =  new ArrayList();
           for(int i =0; i< qsize; i++) {
               
         TreeNode node =  queue.poll();
          
           if(node!=null) {
               b.add(node.val);
               queue.offer(node.left);
               queue.offer(node.right);
           }
               
       }
           if(b.size()>0) {
               result.add(b);
           }
    }
         return;
}
   
}