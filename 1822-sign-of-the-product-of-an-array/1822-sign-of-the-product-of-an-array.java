class Solution {
    public int arraySign(int[] nums) {
      
        int count =0;
        int sine = 0;
                
         for(int i=0 ; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
                break;
            }
             if(nums[i] < 0){
                 sine++;
             }
        }
        
        if(count > 0){
            return 0;
        }
        
        if(sine % 2 == 0){
            return 1;
        }
        return -1;
    }
}