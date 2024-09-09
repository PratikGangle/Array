class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rowOnce[] = new int[m];
        int colOnce[] = new int[n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){                       
                    rowOnce[i]++;               
                    colOnce[j]++;                     
                }                            
            }
        }
        
        int diff[][]  = new int[m][n];
               
        for(int i=0; i<m; i++){            
            for(int j=0; j<n; j++){                    
                int onesRowi = rowOnce[i];
                int onesColj =  colOnce[j];
                int zerosRowi = m -rowOnce[i];
                int zerosColj = n - colOnce[j];
                diff[i][j] = (onesRowi + onesColj) - zerosRowi - zerosColj;
            }
        }
        return diff;        
    }
}