class Solution {    
    public int numSquares(int n) {        
        int dp[] = new int[n+1];        
        for(int i=1; i<=n; i++){
            dp[i] = i;
            for(int j=1; j*j<=i; j++){            
                int square = j*j;            
                dp[i] = Math.min(dp[i],1+dp[i-square]);          
            }
        }
        return dp[n];
    }

    public int solve(int n , int dp[]){         
        if(n < 4){           
            return n;       
        }     
        if(dp[n] != 0){           
            return dp[n];
        }
        int ans = n;              
        for(int i=1; i*i <=n; i++){
            int square = i*i;
            ans = Math.min(1+solve(n-square,dp),ans);        
        }        
        dp[n] = ans;        
        return dp[n];
    }
}
