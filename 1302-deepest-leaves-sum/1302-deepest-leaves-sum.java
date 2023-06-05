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
    public int deepestLeavesSum(TreeNode root) {
        
        int depth = maxDepth(root);
        inorder(root,1, depth);
        
        return sum;
    }
    
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left,right) + 1;
    }
    
     public void inorder(TreeNode root,int curr ,int max){
        if(root == null){
            return ;
        }
        if(curr == max){            
            sum += root.val;
        }
         
         inorder(root.left,curr+1, max);
         inorder(root.right,curr+1,max);

    }
}