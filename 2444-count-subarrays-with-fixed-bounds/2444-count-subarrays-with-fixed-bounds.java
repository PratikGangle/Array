class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        
        long ans=0;
        int j=-1;
        int MinIndex =-1;
        int MaxIndex =-1;
        
        for(int i =0; i<nums.length ; i++){
            
            if(nums[i] < minK  || nums[i] > maxK)
                j=i;
                if(nums[i] == minK)
                    MinIndex =i;
                
                if(nums[i]== maxK)
                    MaxIndex =i;                
                
                ans += Math.max(0, Math.min(MinIndex, MaxIndex) -j);
        
        }

        return ans;        
    }        
}