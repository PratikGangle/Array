class Solution {
    public int[][] generateMatrix(int n) {
        
        int matrix[][] = new int[n][n];
        
        int startRow =0; 
        int startCol =0;
        
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        int k=1;
        while(startRow <=endRow && startCol <=endCol){
            
            //top
            
            for(int j =startCol; j<=endCol; j++){
                matrix[startRow][j]=k++;
            }
            
            
            // rigth
            for(int i = startRow+1; i<=endRow; i++){
               matrix[i][endCol]=k++;
            }
            
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
               matrix[endRow][j] = k++;
            }
            
            //left
            for(int i= endRow-1; i>=startRow+1; i--){
                 if(startCol == endCol){
                    break;
                }
                matrix[i][startCol] = k++;
            }
            
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        
        
        return matrix;
        
    }
}