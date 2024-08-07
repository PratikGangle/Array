class Solution {
    static int dp[][][];
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[strs.length][m+1][n+1];
         for (int[][] matrix : dp) {
             for(int[] row : matrix){
                  Arrays.fill(row, -1);
             }           
        }          
        int ans = helper(strs,m,n,0);         
        return ans;
    }
    
    
     public int helper(String[] strs, int m, int n , int i) {        
         if(i >=strs.length || (m <= 0 && n<=0)){              
            return 0;
        }
         
         if(dp[i][m][n] != -1){
             return dp[i][m][n];
         }       
          
        
         String s = strs[i];
         int zero = 0;
         int one = 0;
         for(int j=0; j<s.length(); j++){
             char c = s.charAt(j);             
             if(c == '0'){
                 zero++;
             }
             else{
                 one++;
             }
         }        
         if(m >= zero && n >= one){
              dp[i][m][n] = Math.max(1+helper(strs,m-zero,n-one,i+1),helper(strs,m,n,i+1));
         }
         else{
             dp[i][m][n] =helper(strs,m,n,i+1);
         }          
        return dp[i][m][n];       
     }        
}