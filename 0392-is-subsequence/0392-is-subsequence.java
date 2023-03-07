class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sn = s.length();
        int tn = t.length();
        
        int i=0;
        int j=0;
        
        while(i <sn && j < tn){
            
            
            char c = s.charAt(i);
            char c1  = t.charAt(j);
            
            
            if( c == c1){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        
        
        if(i == sn){
            return true;
        }
        else{
            return false;
        }
        
    }
}