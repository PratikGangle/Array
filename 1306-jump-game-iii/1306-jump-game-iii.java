class Solution {
    static boolean visit[];
    public boolean canReach(int[] arr, int start) {
        visit = new boolean[arr.length];        
        return solve(arr,start);
    }
    
    
    public boolean solve(int[] arr, int start) {        
        if(arr[start] == 0){
            return true;
        }
        
        if(visit[start]){
            return false;
        }
        visit[start] = true;
        boolean left = false;
        boolean right = false;
        if(arr[start]+start <arr.length){
             left =solve(arr,start+arr[start]);
        }
        
        if(start - arr[start] >= 0){
            right =solve(arr,start-arr[start]);
        }
        return left || right;        
    }
}