class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int ind = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i+1] > nums[i]){
                ind =  i;
                break;
            }
        }        
        // if index -1 reverse array and return
        if(ind == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        // swap index to smallest grater number
        for(int i=nums.length-1; i>=ind; i--){
            if(nums[i] > nums[ind]){                   
                int temp = nums[i];            
                nums[i] = nums[ind];            
                nums[ind] = temp;
                break;
            }
        }
        // reverse the array from index+1 to n       
        reverse(nums,ind+1,nums.length-1);                
    }   
    
    public void reverse(int[] nums,int i, int j){        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }        
    }
}