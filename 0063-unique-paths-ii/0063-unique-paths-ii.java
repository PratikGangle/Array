class Solution {
    static int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         dp = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,obstacleGrid);
    }
    
    
    public int solve(int m, int n,int[][] obstacleGrid) {
         if(m==obstacleGrid.length-1 && n == obstacleGrid[0].length-1){
             if(obstacleGrid[m][n] != 1){
                 return 1;
             }
             else{
                 return 0;
             }
            
        }         
        if(m >=obstacleGrid.length || n >= obstacleGrid[0].length){
            return 0;
        } 
        
        if(obstacleGrid[m][n]==1){
            return 0;
        }
        
        int right =0;
        int down =0;
        
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        //right call           
        right =solve(m,n+1,obstacleGrid); 
                  
        // down call            
        down = solve(m+1,n,obstacleGrid);
        
        return dp[m][n] =right+down;        
    }
}