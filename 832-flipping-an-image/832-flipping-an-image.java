class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int size = image.length -1;
        
        // create new matrix
        
        int ans[][] = new int [image.length][image.length];
        
        
        // reverse each row

       for (int i = 0; i <=size; i++) {
           
           int k = 0;
            for (int j = size; j >= 0; j--) {               
                
                ans[i][k++] = image[i][j];                                
            }
       }
        //  invert the image
           for (int i = 0; i <=size; i++) {
           
              for (int j = 0; j <= size; j++) {               
                
               if( ans[i][j] == 0)   {
                   ans[i][j]=1;
               }
                  else{
                      ans[i][j]=0;
                  }
                  
            }
       }
        
        
        return ans;
        
    }
}