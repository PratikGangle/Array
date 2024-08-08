class Solution {
    static int dp[];
    public int numDecodings(String s) {
        dp = new int[s.length() + 1];
        Arrays.fill(dp,-1);
        return helper(s,0);
    }
    
    
     public int helper(String s,int i) {
         if(i == s.length()){
              return 1;
         }
         
         if(s.charAt(i) == '0'){
             return 0;
         }
         if(dp[i] != -1){
             return dp[i];
         }
              
        int way = helper(s, i+1);
        
         if(i+1 <s.length() && Integer.parseInt(s.substring(i,i+2)) <=26){
              way += helper(s,i+2);
         }
         return dp[i] =way;          
         
     }  
}