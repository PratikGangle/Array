class Solution {
    public boolean canAliceWin(int[] nums) {
        int sdsum = 0;
        int ddsum = 0;
        
        
        for(int val : nums){
            if(val < 10 ){
                sdsum += val;
            }
            else{
                ddsum += val;
            }
        }        
        if(sdsum == ddsum){
            return false;
        }
        return true;
    }
}