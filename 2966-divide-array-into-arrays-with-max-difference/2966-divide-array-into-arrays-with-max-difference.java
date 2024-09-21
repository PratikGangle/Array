class Solution {
    public int[][] divideArray(int[] nums, int k) {        
        Arrays.sort(nums);
        int row = nums.length / 3;
        int ans[][] = new int[row][3];
        
        for(int i=0, j=0; i<nums.length; i+=3 , j++){            
            if(nums[i+2] - nums[i] <= k){
                ans[j] = new int[]{nums[i],nums[i+1],nums[i+2]};
            }
            else{
                return new int[0][0];
            }
        }
        return ans;        
    }
}