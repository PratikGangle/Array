class Solution {
    static int dp[];
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
    
    public int solve(int[] nums,int i) {
        if(i >= nums.length-1){
            return 0;
        }        
        
        if(nums[i] == 0){
            return  Integer.MAX_VALUE-1;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        int ans = Integer.MAX_VALUE-1;
        
        for(int j=1; j<=nums[i]; j++){
            ans = Math.min(1+solve(nums,i+j),ans);
        }        
        return  dp[i]=ans;
              
        
    }
}