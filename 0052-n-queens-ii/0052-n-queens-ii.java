class Solution {     
    boolean row[];        
    boolean upper[];        
    boolean lower[];
    public int totalNQueens(int n) {                    
        row = new boolean[n];
        upper = new boolean[2*n-1];
        lower = new boolean[2*n-1];
        return solve(n,0);            
    }
    
    
    public int solve(int n ,int col){
        if(col >= n){                               
            return 1;
        }          
        int ans = 0;
        for(int i=0; i<n; i++){            
            if(row[i] == false && upper[n-1+col-i] == false  && lower[i+col] == false){
                row[i] = true;
                upper[n-1+col-i] = true;
                lower[i+col] = true;
                ans += solve(n,col+1);                 
                row[i] = false;
                upper[n-1+col-i] = false;
                lower[i+col] = false;                               
            }
        } 
        return ans;        
    }   
}