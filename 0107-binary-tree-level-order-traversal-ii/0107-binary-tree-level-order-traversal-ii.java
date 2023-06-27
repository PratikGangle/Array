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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> s = new ArrayDeque<>();
        s.add(root);
        
        while(!s.isEmpty()){
            int count = s.size(); 
           
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<count; i++){
                TreeNode node = s.remove();
                list.add(node.val);
          
                if(node.left != null){
                    s.add(node.left);
                }
                  if(node.right != null){
                    s.add(node.right);
                }
            }
             res.add(list);
        }
        
        for(int i=res.size()-1; i>=0; i--){
            List<Integer> li = res.get(i);
            ans.add(li);
        }
        
        return ans;
    }
}