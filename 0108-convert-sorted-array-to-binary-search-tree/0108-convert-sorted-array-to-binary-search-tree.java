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
        
        return solve(nums,0,nums.length -1);
    }
    
     public TreeNode solve(int[] nums , int st , int end) {
         
         if(st > end){
             return null;
         }
         
         // find the mid element
         int mid =  st+ ((end -st )/2);
         TreeNode root = new TreeNode(nums[mid]);
         
         root.left =solve(nums,st,mid-1);
         root.right =solve(nums,mid+1,end);             
         
         return root;
     }
}