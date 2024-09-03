class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        
        int l = 0;
        int r = nums.length-1;
        // for first position
        while(l <= r){            
            int mid = (l + r)/2;            
            if(nums[mid] == target){
                arr[0] = mid;
                r = mid-1;
            }
            else if(nums[mid] > target){
                r = mid-1;                
            }
            else{
                l = mid+1;                
            }                
        }
        
        l = 0;
        r = nums.length-1;
        
         // for last position
        while(l <= r){             
            int mid = (l + r)/2;            
            if(nums[mid] == target){
                arr[1] = mid;
                l = mid+1;
            }
            else if(nums[mid] > target){
                r = mid-1;                
            }
            else{
                l = mid+1;                
            }                
        }
       
        return arr;
    }
}