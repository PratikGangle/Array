class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];            
        }
        
        // sort the array
        Arrays.sort(nums);
        
        return nums;
    }
}