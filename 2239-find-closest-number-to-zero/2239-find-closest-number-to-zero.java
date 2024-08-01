class Solution {
    public int findClosestNumber(int[] nums) {         
        int ans = nums[0];        
        for(int i=1; i<nums.length; i++){
            int diff = Math.abs(ans-0);
            int curr = Math.abs(nums[i] - 0);            
            if(curr < diff){
                ans = nums[i];
            }
            if(curr == diff){
                ans = Math.max(ans, nums[i]);
            }
        }                      
        return ans;
    }
}