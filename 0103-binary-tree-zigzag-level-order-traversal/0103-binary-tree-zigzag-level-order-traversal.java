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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        int level =0;
        Deque<TreeNode> q = new LinkedList();
        q.add(root);
        
        while(q.size() > 0){
            int count = q.size();
            List<Integer> list = new ArrayList<>();
            
            if(level % 2 == 0){
                for(int i=0; i< count ; i++){
                    root = q.removeFirst();
                    list.add(root.val);
                    if(root.left != null){
                        q.addLast(root.left);
                    }
                
                    if(root.right != null){
                        q.addLast(root.right);
                    }
                }
            }
            
            else{
                for(int i=0; i<count ; i++){
                    root = q.removeLast();
                    list.add(root.val);
                    if(root.right != null){
                        q.addFirst(root.right);
                    }
                    if(root.left != null){
                        q.addFirst(root.left);
                    }
                }
            }
           
            res.add(list);
            level++;
        }
        return res;
    }
}