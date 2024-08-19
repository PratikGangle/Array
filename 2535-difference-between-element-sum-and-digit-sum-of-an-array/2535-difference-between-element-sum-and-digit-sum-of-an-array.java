class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digSum = 0;
        for(int i=0; i<nums.length; i++){            
            int number = nums[i];
            eleSum += number;
            if(nums[i] < 10){
                digSum += nums[i];                   
            }
            else{
                while(number > 0){
                    digSum += number%10;
                    number = number/10;
                }
            }
        }
        return eleSum - digSum ;
        
    }
}