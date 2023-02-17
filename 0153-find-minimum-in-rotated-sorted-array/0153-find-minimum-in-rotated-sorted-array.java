class Solution {
    public int findMin(int[] nums) {
        
       int i =0;
        int j = nums.length-1;
        
        while(i<=j){
            
            int mid = i + ((j-i)/2);
            
            int left = ( (mid -1+nums.length ) % nums.length);                 
            int right = ((mid +1 )%nums.length);
          
            if(nums[mid] <= nums[left] && nums[mid] <= nums[right])
            {
                return nums[mid];
            }
            
            else if(nums[mid] <= nums[j]){
                j = mid -1;                
            }
            else{
                i = mid + 1;
            }
            
        }
        return -1;
    }
}