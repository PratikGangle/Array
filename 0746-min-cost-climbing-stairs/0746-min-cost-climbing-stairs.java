class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
       int dp[] = new int[cost.length];
        
        for(int i=0; i<cost.length; i++){
            dp[i]  = -1;
        }
       return  helper(cost , cost.length, dp);
        
    }
    
    public int helper(int [] cost, int i , int dp[]){
        
        if(i== 0  || i==1){
            return 0;
        }
        
        int a, b;
        if(dp[i-1] != -1){
            a = dp[i-1];
        }
        else{
                a =cost[i-1] + helper(cost,  i-1 ,dp);
            dp[i-1] =a;
        }
        if(dp[i-2] != -1){
            b = dp[i-2];
            dp[i-2] = b;
        }
     
       else{
             b =cost[i-2] + helper(cost, i-2 , dp) ;
       }
            
        return Math.min(a,b);
        
    }
}