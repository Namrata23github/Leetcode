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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList();
        
        if(root == null) {
            return l;
        }
         boolean level = false;
        
       Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            List<Integer> s = new ArrayList<Integer>();
           
            
            int size = q.size();
            
            for (int i =0; i<size; i++) {
                TreeNode t = q.poll();
                if(t.right!=null) {
                    q.offer(t.right);
                   
                }
                
                if(t.left!=null) {
                   
                    q.offer(t.left);
                }
                
                if(level) {
                    s.add(t.val);
                }else {
                    s.add(0, t.val);
                }
            }
            
            level = !level;
            
            l.add(s);
        }
        return l;
    }
}