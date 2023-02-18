class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];      

        left[0] =0;
        right[0] =0;
        left[height.length-1] =0;
        right[height.length-1] =0;
        
         for(int i=1; i<height.length; i++){
                left[i] = Math.max(left[i-1],height[i-1]);            
         }
        
         for(int i=height.length-2;  i>=0; i--){
                right[i] = Math.max(right[i+1],height[i+1]);            
         }
                
        int ans=0;
        
        for(int i=0; i<height.length; i++){              
            int min = (Math.min(right[i],left[i]))-height[i];            
            if(min>0){
                ans = ans + min;
            }            
        }
        return ans;
    }
}