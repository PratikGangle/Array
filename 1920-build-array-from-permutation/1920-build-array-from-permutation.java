class Solution {
    public int[] buildArray(int[] nums) {
        
        
        // creat new array
        int [] arr = new int [nums.length];



        // assign value in new array
        for (int i = 0; i < arr.length; i++) {
            
           arr[i]  = nums[nums[i]];
          
        }


       // retrun array
        
        return arr;
        
        
    }
}