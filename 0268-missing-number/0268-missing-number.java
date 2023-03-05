class Solution {
    public int missingNumber(int[] nums) {
        
        int flag;
        for(int i=0; i<= nums.length; i++){
             flag =-1;            
            for(int j=0; j<nums.length; j++){
                
                if(nums[j] ==i){
                    flag =0;
                    break;
                }
            }
            if(flag ==-1){
                return i;
            }
        } 
        
        return -1;
    }
}