class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0] = 0;
        boolean odd = true;
        for(int i=1; i<n+1; i++){
            if(odd){
                ans[i] =ans[i/2]+1;
                odd = false;
            }else{
                ans[i] = ans[i/2];
                odd = true;
            }
        }        
        return ans;
    }
}