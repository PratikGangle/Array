class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) { 
        int res[] = new int[queries.length];   
        int sumEven = 0;
        
        // find the even number sum 
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                sumEven += nums[i];
            }
        }
        
        
        for(int i=0; i<queries.length; i++){            
            int val =queries[i][0];
            int index =queries[i][1]; 
        
            if(nums[index] %2 == 0){
                sumEven -= nums[index];
            }
            
            nums[index] += val;
            
            if(nums[index] % 2 == 0){
                sumEven += nums[index];
            }          
            res[i] = sumEven;
        }
        return res;
    }
}