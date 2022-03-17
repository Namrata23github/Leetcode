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
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> a = new Stack();
        
        find(root, k, a);
        return a.pop();
    }
    
    public void find(TreeNode root, int k,  Stack<Integer> a) {
        if(root == null|| a.size() >= k) {
            return;
        }
        
        find(root.left, k, a);
               

        if(a.size() < k ) {
            a.push(root.val);
        }else {
            return;
        }
        find(root.right, k, a);
    }
}