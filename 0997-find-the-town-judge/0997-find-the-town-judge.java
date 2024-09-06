class Solution {
    public int findJudge(int n, int[][] trust) {
        int outDegree[] = new int[n+1];
        int inDegree[] = new int[n+1];
        
        for(int i=0; i<trust.length; i++){
            int u  = trust[i][0];             
            int v  = trust[i][1];            
            outDegree[u]++;
            inDegree[v]++;            
        }
        
        for(int i=1; i<=n; i++){
            if(inDegree[i] == n-1 && outDegree[i] == 0){
                return i;
            }
        }
        return -1;
    }
}