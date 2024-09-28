class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;        
        for(int i=0; i<grid.length; i++){ 
            int index = findNegative(grid[i]);
            int n = grid[i].length;
            count += n - index;
        }
        return count;
    }
    
     public int findNegative(int[] grid) {         
         int start = 0;
         int end = grid.length -1;
         int pos = -1;
         
         while(start <= end){
             int mid = (start + end)/2;
             
             if(grid[mid] >= 0 ){
                 start = mid + 1;
             }
             else{
                 pos = mid;
                 end = mid -1;
             }
         }
         if(pos != -1) return pos;
         return grid.length;         
     }
}