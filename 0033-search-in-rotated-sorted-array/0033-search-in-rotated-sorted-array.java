class Solution {
    public int search(int[] nums, int target) {
        
        if(nums[0] < nums[nums.length -1]){
            return binarySearch(nums, target , 0, nums.length-1);
        }
        
        if(nums.length== 1){
           if( nums[0]==target){
               return 0;
           }
            else{
                return -1;                
            }
        }
      
        int a = peek(nums);  
        
       
                               
        if(target >= nums[0] && target <= nums[a-1]){
            return  binarySearch(nums, target , 0, a-1);
        }        
         else if(target >= nums[a] && target <= nums[nums.length-1]) {
              return binarySearch(nums, target , a, nums.length-1);
         }      
          
        return -1;
               
       
    }

    int binarySearch(int[] nums , int target, int i , int j){
       
        while(i<=j){
            int mid = (i + ((j-i)/2));

            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid] < target){
                i = mid +1;
            }
            else {
                j = mid -1;
            }
        }
        return -1;


    }       
       
      public int peek(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
          int prev=0;
          int next =0;

        while (i <= j) {
            int mid = (i +((j - i) / 2));
            
            prev = (((mid+nums.length)-1)%nums.length); 
            next = (mid +1 )%nums.length;
            
            if(nums[mid] <= nums[prev]  && nums[mid] <= nums[next]){
                return mid;
                                
            }
            else if(nums[mid] <= nums[j]){
                j = mid - 1;
            }
            else if(nums[mid] >= nums[i]){
                i= mid + 1;
            }
            
           
          
        }
        return 0;

    }
   
}