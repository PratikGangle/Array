class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder();        
        int n = indices.length;
        char afterShuffling[] = new char[n];
        
        for(int i=0; i<n; i++){
            int index = indices[i];            
            afterShuffling[index] = s.charAt(i);            
        }
        
        for(int i=0; i<n; i++){
            char c =afterShuffling[i];
            str.append(c);
        }
        return str + "";
    }
}