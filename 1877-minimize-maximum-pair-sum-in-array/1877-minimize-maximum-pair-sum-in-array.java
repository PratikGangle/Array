class Solution {
    public int minPairSum(int[] nums) {        
        Arrays.sort(nums);        
        int ans = Integer.MIN_VALUE;         
        int n =nums.length;
        
        for(int i=0; i<n/2 ; i++){            
            int pair = nums[i] + nums[n-1-i];
            ans = Math.max(ans,pair);
        }
        return ans;
    }
}