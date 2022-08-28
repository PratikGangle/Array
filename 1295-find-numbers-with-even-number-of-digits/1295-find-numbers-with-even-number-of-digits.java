class Solution {
    public int findNumbers(int[] nums) {
        
        
        int ans=0;

        int temp;
        
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            int digit =0;
            
            // find number of digit in the number

            while(temp>0)
            {
                 
                digit++;
                temp =temp/10;
            
            }
            // check digit even or odd
            if(digit%2==0)
            {
                
                ans++;
            }
        }
        // return the ans

        return ans;
    
        
    }
}