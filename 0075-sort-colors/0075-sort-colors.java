class Solution {
    public void sortColors(int[] nums) {
        
    if(nums.length==1){
        return;
    }
    int i=0;
    int j=0;
    int k= nums.length-1;
    
    while(j<=k){
        if(nums[j] == 0){
            if(i==j){
                i++;
                j++;
            }
            else{
                int temp = nums[i];
                nums[i] =nums[j];
                nums[j] = temp;
                i++;
            }
        }
            else if(nums[j]==1){
                j++;
            }
            else{
                int temp = nums[k];
                nums[k] =nums[j];
                nums[j] = temp;
                k--;
            }        
    }
        
    }
}