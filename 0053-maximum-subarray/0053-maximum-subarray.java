class Solution {
    public int maxSubArray(int[] nums) {               
        // kadane algorithm        
        int cs = 0; // current sum
        int ms = Integer.MIN_VALUE;  // MAX SUM
        
        for(int i=0; i<nums.length; i++){            
            cs += nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms,cs);
        }
        
        if(ms == 0){  // if array have all negative number
            int MaxValue = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){                                  
                if(nums[i] > MaxValue){
                    MaxValue = nums[i];
                }                
            }
            return MaxValue;
        }
        return ms;
    }
}
        // prefix method
//         int prefix[] = new int[nums.length];        
//         prefix[0] = nums[0];        
//         for(int i=1; i<nums.length; i++){
//             prefix[i] = prefix[i-1] + nums[i];
//         }        
        
//         int currSum = 0;       
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i<nums.length; i++){                       
//             for(int j=i; j<nums.length; j++ ){
//                 currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1] ;                  
//                 if(currSum > maxSum){
//                     maxSum = currSum;
//                 }
//             }                    
//         }     
//         return maxSum;  
//     }  
        
    //}

