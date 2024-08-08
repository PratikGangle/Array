class Solution {
    static int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
       return solve(m,n);
    }
    
    public int solve(int m, int n) {
         if(m==1 && n == 1){
            return 1;
        }        
        int left =0;
        int down =0;
        
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        //left call
        if(n != 1){
            left =solve(m,n-1); 
        }          
        // down call
        if(m != 1){
            down = solve(m-1,n);
        }
        
        return dp[m][n] =left+down;
    }
    
}