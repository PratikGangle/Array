class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        
        String revStr = str  + "";
      
        int n = s.length();
        int m = revStr.length();
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                 if(s.charAt(i-1)  == revStr.charAt(j-1)){
                dp[i][j] = 1 +dp[i-1][j-1];
                 }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
           
        return dp[n][m];
    }
    
}