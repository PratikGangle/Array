class Solution {
    public int countOdds(int low, int high) {
       int diff = (high - low )/2;
        
        if(low %2 == 0 && high %2 ==0){
            return diff;
        }
        else{
            return diff +1;
        }
    }
}