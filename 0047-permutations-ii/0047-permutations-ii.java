class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Set<List<Integer>> ans = new HashSet<>();
        
        helper(nums, 0, ans);
        
         List<List<Integer>> finalAns = new ArrayList<>();
        
        for(List<Integer> l : ans){
            finalAns.add(l);
        }
        
        return finalAns;
        
    }
    
      public void helper(int [] nums , int idx , Set<List<Integer>> ans){
        
        if(idx == nums.length){            
            List<Integer> list = new ArrayList<>();            
            for(int i: nums){
                list.add(i);
            }
            ans.add(list);
            return;
        }
        
        
        
        for(int i=idx; i<nums.length; i++){            
            swap(nums,idx,i);            
            helper(nums,idx+1,ans);
            swap(nums,idx,i);            
        }
    }
    
    
    // create a function for swap array element    
    public void swap(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}