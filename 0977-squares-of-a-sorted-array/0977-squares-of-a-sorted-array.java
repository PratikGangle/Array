class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        
        int l=0;
        int r=nums.length-1;
        
        int k= nums.length-1;
        
        while(l<=r){
            if(nums[l] * nums[l] > nums[r] * nums[r]){
                res[k--] = nums[l] * nums[l];
                l++;
            }
            else{
                res[k--] = nums[r] * nums[r];   
                r--;
            }
        }
        return res;
    }
}