class Solution {
    public int maxProduct(int[] nums) {  
        int max1 = nums[0];
        int max2 = Integer.MIN_VALUE;
        
        // find the first max value
        for(int i=0; i<nums.length; i++){
            if(max1 < nums[i]){
                max1 = nums[i];
            }
        }
        
        int count = 0;
        // check count of max value
        for(int i=0; i<nums.length; i++){
            if(max1 == nums[i]){
                count++;
            }
        }
        // if count is greter then 2 so we know second max value is equal to first max value
        if(count != 1){
            max2 = max1;
            return (max1-1) * (max2-1);
        }
        
        // find the second max value if first max duplicate not eixts
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max2 && nums[i] < max1){
                max2 = nums[i];
            }
        }
        return (max1-1) * (max2-1);
        
        // second methed
        // int n = nums.length;
        // Arrays.sort(nums);               
        // return (nums[n-1]-1) * (nums[n-2]-1);
    }
}