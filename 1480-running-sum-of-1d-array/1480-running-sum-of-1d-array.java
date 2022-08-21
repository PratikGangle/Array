class Solution {
    public int[] runningSum(int[] nums) {
        
        
      
        // create a new array

        int[] arr  = new int[nums.length];

        arr[0] = nums[0];

        for (int i = 1; i <nums.length; i++) {

            arr[i] = arr[(i-1)] + nums[i];
            
        }

       return arr;
    }
}