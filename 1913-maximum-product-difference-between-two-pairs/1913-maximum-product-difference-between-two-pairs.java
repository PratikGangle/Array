class Solution {
    public int maxProductDifference(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
        
//         int firstPair = nums[n-1] * nums[n-2];            
//         int secondPair =nums[0] * nums[1];
        
        int a =Integer.MIN_VALUE;
        int b =Integer.MIN_VALUE;          
        int c = Integer.MAX_VALUE;            
        int d = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            // for max value
            if(nums[i] > a){
                b = a;
                a = nums[i];
            }
            else{
                if(nums[i] > b){
                    b = nums[i];
                }
            }
            
            //for min value;            
            if(nums[i] < c){               
                d = c;               
                c = nums[i];            
            }
            else{
                if(nums[i] < d){
                    d = nums[i];
                }
            }
        }
        int firstPair = a * b;            
        int secondPair =c * d;
        
        return firstPair - secondPair;
    }
}