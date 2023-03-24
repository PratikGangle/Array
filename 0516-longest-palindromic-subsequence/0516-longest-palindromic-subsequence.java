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
                dp[i][j] = -1;
            }
        }
        return lcs(s,revStr, n, m ,dp);
        
        
    }
    
    public int lcs (String s1 , String s2, int n ,int  m ,int dp[][]){
        
        if(n==0 || m==0){
            return 0;
        }
        
        if(dp[n][m]  != -1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)  == s2.charAt(m-1)){
            return dp[n][m] = 1 + lcs(s1,s2,n-1,m-1 , dp);
        }
        else{
            return dp[n][m] = Math.max(lcs(s1,s2,n-1,m , dp), lcs(s1,s2,n,m-1,dp));
        }
    }
}