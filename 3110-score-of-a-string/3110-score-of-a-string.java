class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            char c1 = s.charAt(i+1);            
            ans += Math.abs(c1 - c);            
        }
        return ans;        
    }
}