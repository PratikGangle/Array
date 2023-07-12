class Solution {
    public int maximumProduct(int[] nums) {
        // find the size of array
        int n = nums.length-1;
        // sort the array
        Arrays.sort(nums);
      
        return Math.max(nums[0]*nums[1]*nums[n],nums[n-1]*nums[n-2]*nums[n]);
        
    }
}