class Solution {
    public int findPeakElement(int[] nums) {
        
        // if array contain one elelment return index 0
        if(nums.length == 1){
            return 0;
        }
       
        // find the peek element
        for(int i =0; i<nums.length-1; i++){            
            if(nums[i] > nums[i+1]){
                return i;
            }
        }
        // if we not found the i th element that meaning array list sorted
        // so we are reture the last index of the array
        return nums.length-1;
    }
}