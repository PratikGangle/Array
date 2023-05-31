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
    public TreeNode increasingBST(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        inorder(root,list);  // give the sorted sequence of the BST in the ArrayList
        
        
        // create a new tree every node has no left child and only one right child.
        TreeNode node =new TreeNode(list.get(0));        
        TreeNode temp = node;
        for(int i=1; i<list.size(); i++){
            int val = list.get(i);
            temp.right = new TreeNode(val);
            temp = temp.right;
        }      
        
        return node;         
    }
    
    
    public void inorder(TreeNode root , List<Integer> list){        
        if(root == null){
            return;
        }
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right,list);
        
    }       
}