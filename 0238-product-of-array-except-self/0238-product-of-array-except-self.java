class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;
        
        int[] prefix = new int[size];
        int [] suffix = new int[size];
        
          int [] ans = new int[size];
        
        prefix[0] = 1;
        suffix[size-1] = 1;
        
        
        for(int i=1 ; i<nums.length;  i++){            
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        
        for(int i =size-2;  i>=0; i--  ){
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        
        
        for(int i=0; i<nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        
        return ans;
        
        
        
        
        
        
    }
}