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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length ==0) {
            return null;
        }
        return tr (nums, 0, nums.length -1);
    }
    
     public TreeNode tr(int[] nums, int low, int high) {
         if(low> high) {
             return null;
         }
         
         int mid = (high + low)/2;
         TreeNode n = new TreeNode(nums[mid]);
         n.left = tr(nums, low, mid -1);
         n.right = tr(nums, mid +1, high);
         return n; 
     }
}