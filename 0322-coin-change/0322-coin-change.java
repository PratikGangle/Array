class Solution {
    static int dp[][];
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1][coins.length+1];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        int res = solve(coins, amount ,0);
        return (res == Integer.MAX_VALUE-1) ? -1 : res;
    }
    
     public int solve(int[] coins, int amount,int i) {        
         if(amount <= 0 || i >=coins.length){
             return (amount == 0) ? 0 : Integer.MAX_VALUE-1;                 
         }
        
         if(dp[amount][i] != -1){
             return dp[amount][i];
         }
         int res = 0;
         if(coins[i] <= amount){
             res = Math.min(1+solve(coins,amount-coins[i] , i) , solve(coins,amount, i+1));
         }
         else{
             res = solve(coins,amount, i+1);
         }         
         return dp[amount][i]=res;        
    }
}