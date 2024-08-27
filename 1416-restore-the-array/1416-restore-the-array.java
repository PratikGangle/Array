class Solution {
    int MOD = 1000000007;
    int dp[];
    public int numberOfArrays(String s, int k) {    
        dp = new int[s.length()+ 1];
        Arrays.fill(dp,-1);     
        return solve(0,s,k);
    }
    
    public int solve(int start ,String s, int k){        
        if(start >= s.length()){
            return 1;
        }
        if(dp[start] != -1){
            return dp[start];
        }
        if(s.charAt(start) == '0'){
            return 0;
        }        
        long ans = 0;        
        long num  = 0;
        
        for(int end = start; end <s.length(); end++){            
            num = (num*10) +  (s.charAt(end) - '0');            
            if(num > k){
                break;
            }            
            ans = ((ans%MOD) + solve(end+1,s,k)%MOD)%MOD;
        }
        return dp[start] =(int)ans;
    }
}