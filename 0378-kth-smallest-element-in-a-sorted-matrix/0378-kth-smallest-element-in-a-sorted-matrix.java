class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        ArrayList <Integer> list = new ArrayList<>();
        
        // store matrix in arraylist
        for(int i=0; i<matrix.length; i++){            
            for(int j=0; j<matrix[i].length ; j++){
                list.add(matrix[i][j]);
            }
        }       
        //sort the list
        Collections.sort(list);
                
        // return k th smallest element
        return list.get(k-1);
    
        
    }
}