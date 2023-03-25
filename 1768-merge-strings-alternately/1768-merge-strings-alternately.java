class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder str = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        
        int i =0;
        int j=0;
        
        while( i<n  &&  j<m){
            
             str.append(word1.charAt(i));
                i++; 
            
            str.append(word2.charAt(j));
                j++;
        }
        
        while(i<n){
            str.append(word1.charAt(i));
                i++;
        }
        
        while(j<m){
             str.append(word2.charAt(j));
                j++;
        }
        
        return str.toString();
    }
}