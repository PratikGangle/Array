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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        helper(root,list,"");
        
        return list;
    }
    
    public void helper(TreeNode root , List<String> list ,String str){
        
        if(root == null){
            return;
        } 
        
        if(root.left == null && root.right == null){
            str = str + "" + root.val;
            list.add(str);
            return;
        }
       
         str = str + root.val + "->";
              
        helper(root.left, list,str);
       
        helper(root.right, list,str);
    }
}