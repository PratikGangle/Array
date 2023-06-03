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
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
    
     
    public boolean helper(TreeNode root,int val) {
        if(root == null){
            return true;
        }
        if(root.val != val) return false;
        
         
        boolean left = helper(root.left,root.val);
        boolean right =helper(root.right,root.val);
        
        return left && right;
    }
}