/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(root == null){
            return res;
        }
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node node = q.remove();
            
            if(node == null){
                res.add(new ArrayList<>(list));
                if(q.isEmpty()){
                    return res;
                }
                list.clear();
                q.add(null);
            }
            
            else{
                list.add(node.val);
                for(int i=0; i<node.children.size(); i++){
                Node temp = node.children.get(i);
                q.add(temp);
                }
            }
        }
        return res;
    }
}