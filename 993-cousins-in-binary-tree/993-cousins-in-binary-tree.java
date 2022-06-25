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
    
    TreeNode parent; 
    int depth = -1; 
   
    public boolean isCousins(TreeNode root, int x, int y) {
      
        getDepth(root, x, 0, null);
          int xd  = depth;
        TreeNode xp = parent;
        depth = -1;
        parent = null;
         getDepth(root, y, 0, null);
        
        if(depth == xd && xp!= parent) {
            return true;
        }
        return false;
    }
    
    void getDepth(TreeNode root, int x, int d, TreeNode p) {
        
        if(root == null || depth!= -1) {
            return;
        }
        if(root.val == x) {
            depth = d;
            parent = p;
            return;
        }
       
        getDepth(root.left, x, d+1, root);
        getDepth(root.right, x, d+1, root);
    }
}