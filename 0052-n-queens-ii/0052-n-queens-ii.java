class Solution {
    public int totalNQueens(int n) {     
        char arr[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = '.';
            }
        }       
        return solve(arr,0);            
    }
    
    
    public int solve(char arr[][] ,int col){
        if(col >= arr[0].length){                               
            return 1;
        }         
        int ans = 0;
        for(int i=0; i<arr[0].length; i++){            
            if(safe(arr,i,col)){                
                arr[i][col] = 'Q';
                ans += solve(arr,col+1);
                arr[i][col] = '.';                
            }
        } 
        return ans;        
    }
    
    
    public boolean safe(char arr[][], int r ,int c){
        int row = r ;
        int col  = c;
        // for left 
        while(col >= 0){
            if(arr[row][col] == 'Q') return false;
            col--;
        }
        row = r;
        col = c;
        // for up 
        while(row >= 0 && col >= 0){
            if(arr[row][col] == 'Q') return false;
            row--;
            col--;            
        }          
        row = r;
        col = c;           
        while(row < arr[0].length && col >= 0){           
            if(arr[row][col] == 'Q') return false;           
            row++;
            col--;            
        }          
        return true;        
    }
        
    
}