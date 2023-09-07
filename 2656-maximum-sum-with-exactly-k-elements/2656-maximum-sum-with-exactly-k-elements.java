class Solution {
    public int maximizeSum(int[] nums, int k) {     
        int max = Integer.MIN_VALUE;        
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int sum = 0;
        while(k != 0){
            sum += max++;   
            k--;
        }
        return sum;
    }
}