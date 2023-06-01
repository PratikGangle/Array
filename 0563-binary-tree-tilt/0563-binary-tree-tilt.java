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
    int res =0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        helper(root);        
        return res;
        
        
    }
     public int helper(TreeNode root) {
        
         if(root == null){
             return 0;
         }
         
         int left = helper(root.left);        
         int right = helper(root.right);
         
         res += Math.abs(left - right);
         return left + right + root.val;
     
     }
    
}