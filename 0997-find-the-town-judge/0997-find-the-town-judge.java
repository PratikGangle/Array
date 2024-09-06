class Solution {
    public int findJudge(int n, int[][] trust) {
        int count[] = new int[n+1];       
        
        for(int i=0; i<trust.length; i++){
            int u  = trust[i][0];             
            int v  = trust[i][1];  
            
            count[u]--;
            count[v]++;            
        }
        
        for(int i=1; i<=n; i++){
            if(count[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}