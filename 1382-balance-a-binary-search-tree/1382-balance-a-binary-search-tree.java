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
    public TreeNode balanceBST(TreeNode root) {
            
        ArrayList<Integer> list = new ArrayList<>();
       
        sortList(root,list);
        
        return createTree(list,0,list.size()-1);
    }
    
    public void sortList(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }        
        sortList(root.left,list);
        list.add(root.val);
        sortList(root.right,list);
    }
    
    public TreeNode createTree(ArrayList<Integer> list,int start ,int end){
        if(start > end){
            return null;
        }     
        
        int mid = start + (end - start)/2;
        
        TreeNode root = new TreeNode(list.get(mid));
        
        root.left = createTree(list,start,mid-1);
        root.right = createTree(list,mid+1,end);
        
        return root;
    }
}