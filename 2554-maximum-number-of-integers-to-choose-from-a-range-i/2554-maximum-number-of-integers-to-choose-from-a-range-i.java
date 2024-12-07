class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {        
        int count = 0;        
        for(int num = 1; num <=n; num++){
            if(checkBanned(num,banned)){
                continue;
            }            
            if(num <= maxSum){
                count++;
                maxSum -= num;
            }
            else{
                break;
            }
        }
        return count;
    }
    
    public boolean checkBanned(int n , int[] banned){        
        for(int i=0; i<banned.length; i++){
            if(banned[i] == n){
                return true;
            }
        }
        return false;        
    }
}