class Solution {
    public int strStr(String haystack, String needle) {
        
        
     
        int s1=haystack.length();
        int s2 = needle.length();
        
        if(s1 ==1 && s2==1){
            if(haystack.charAt(0) == needle.charAt(0)){
                return 0;
            }
            else{
                return -1;
            }
        }
        
        int i=0;        
        for(i=0; i<s1-s2+1; i++){
            int j;            
            for(j=0; j<s2; j++){               
                
                if(haystack.charAt(i+j) != needle.charAt(j)) {                    
                    break;
                }                
            }
            if(j==s2){
                return i;
            }   
                      
        }
        return -1;
    }
}