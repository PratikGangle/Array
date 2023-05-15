class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int left = 0;
        int right =0;
        
        // sum of all element        
       for(int i=0; i<nums.length; i++){
           right +=nums[i];
       }
        
        
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            right -=val;
            nums[i] = Math.abs(right -left);
            left +=val;
        }
        
        
        return nums;
    }
}