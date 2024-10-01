class Solution {
    public boolean canArrange(int[] arr, int k) {
        int map[] = new int[k];        
        for(int i=0; i<arr.length; i++){
            int index = ((arr[i] % k)+k ) % k ;                  
            map[index]++;
        }
        
        if(map[0] % 2 != 0){
            return false;
        }
        
         for(int i=1; i<=k/2; i++){           
             int countHalf = k - i;
             if(map[countHalf] != map[i] ){
                 return false;
             }
        }         
        return true;
    }
}