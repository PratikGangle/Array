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
    int min = Integer.MAX_VALUE;
    int prev =Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {

        MinimumDifference(root); 
        
        return min;
    }
    
     public void MinimumDifference(TreeNode root) {
        if(root == null){
            return;
        }
    
         MinimumDifference(root.left );
         
         min = Math.min(min, Math.abs(prev-root.val));
         prev = root.val;
         
         MinimumDifference(root.right);
    }
}