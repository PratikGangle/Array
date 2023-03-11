class Solution {
    
     List<List<Integer>> list = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
             
        //using a helper function
        helper(nums, new ArrayList<Integer>(),0);
        
        return list;
    }
    
    
    public void helper(int[] nums, ArrayList<Integer> output , int index){
        
        if(index == nums.length){
            list.add(output);
            return;
        }
        
        // not include
        
        helper(nums , new ArrayList<>(output) ,index+1);
        //include
        
        output.add(nums[index]);
        helper(nums , new ArrayList<>(output) ,index+1);
                      
    }
    
    
}