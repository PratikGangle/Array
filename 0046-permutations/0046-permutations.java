class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
         List<List<Integer>> list = new ArrayList<>();
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        helper(list, temp, nums, 0);

       
        return list;
        
    }
    
      public void helper(List<List<Integer>> list, ArrayList<Integer> op, int in[], int index) {
        if (in.length == index) {
            list.add(op);
            return;
        }
        int ele = in[index];
        for (int i = 0; i <= op.size(); i++) {
            ArrayList<Integer> l = new ArrayList<>(op);
            l.add(i, ele);
            helper(list, l, in, index + 1);
        }
    }
}