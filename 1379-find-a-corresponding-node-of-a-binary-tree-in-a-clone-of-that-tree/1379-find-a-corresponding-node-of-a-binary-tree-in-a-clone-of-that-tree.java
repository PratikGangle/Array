/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
         
        return findNode(cloned,target.val);
    }
    
    
    public TreeNode findNode(TreeNode root , int val){
        if(root == null){
            return null;
        }
        
        if(root.val == val){
            return root;
        }
        
        TreeNode n1 = findNode(root.left,val);
        TreeNode n2 =findNode(root.right,val);
        
        if(n1 != null){
            return n1;
        }
        
        return n2;
                                  
    }
}