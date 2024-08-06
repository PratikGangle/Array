class Solution {
    static  int arr[];
    public int rob(int[] nums) {
       arr = new int[nums.length];        
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        return helper(nums,0);
    }    
    
    public int helper(int[] nums,int i) {        
        if(i >= nums.length){
            return 0;
        }        
        if(arr[i] != -1){
            return arr[i];
        }        
        arr[i] = Math.max(nums[i] + helper(nums,i+2) , helper(nums,i+1)); 
        return arr[i];
    }
}

