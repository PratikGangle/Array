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
    int sum=0;
    int max=0;
    public int deepestLeavesSum(TreeNode root) {
        
        max = maxDepth(root);
        helper(root,1);
        
        return sum;
    }
    
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
                
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left,right) + 1;
    }
    
     public void helper(TreeNode root,int curr){
        
         if(root == null) return ;
              
         if(curr == max) sum += root.val;
         
         helper(root.left,curr+1);
         helper(root.right,curr+1);
    }
}