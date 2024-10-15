class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int white = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '1'){
                white++;                
            }
            else{
                swap += white;                
            }
        }
        return swap;
    }
}