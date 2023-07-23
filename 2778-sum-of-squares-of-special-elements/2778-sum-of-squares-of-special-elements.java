class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int tot = 0;
        for(int i = 1; i<=nums.length; i++){
            if( n % i == 0){
                tot += nums[i-1] * nums[i-1];
            }
        }
        return tot;
    }
}