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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        List<Double> list = new ArrayList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int n = queue.size();
            
            double sum = 0.0;
            
            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    System.out.print("1");
                    queue.offer(node.right);
                }                
            }
            
            list.add( sum/ n);
        }
        
        return list;
    }
}