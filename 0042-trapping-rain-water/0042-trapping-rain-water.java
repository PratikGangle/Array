class Solution {
    public int trap(int[] height) {
        int ans=0;
        
        for(int i=0; i<height.length; i++){
            
            int left =0;
            int right =0;
            
            for(int j =0 ; j<i; j++){
                left = Math.max(left,height[j]);
            }
            
            for(int k =i; k<height.length; k++){
                right = Math.max(right,height[k]);
            }
            
            int min = (Math.min(right,left))-height[i];
            
            if(min>0){
                ans = ans + min;
            }
            
        }
        return ans;
    }
}