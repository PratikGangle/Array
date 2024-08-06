class Solution {       
    static  int arr[];   
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        arr = new int[nums.length];        
        Arrays.fill(arr,-1);
        int a = helper(nums,1);   
        Arrays.fill(arr,-1);
        int b = helper1(nums,0);         
        return Math.max(a,b);
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
    
     public int helper1(int[] nums,int i) {         
        if(i >= nums.length-1){
            return 0;
        }        
        if(arr[i] != -1){
            return arr[i];
        }        
        arr[i] = Math.max(nums[i] + helper1(nums,i+2) , helper1(nums,i+1)); 
        return arr[i];
    }
}