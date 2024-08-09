class Solution {
      public boolean canJump(int[] nums) {
          int maxInd = 0;
          
          for(int i=0; i<nums.length; i++){
              if(i > maxInd){
                  return false;
              }
              maxInd = Math.max(maxInd , nums[i]+i);
              
              if(i >= nums.length-1){
                  return true;
              }
          }
          return true;          
      }
}