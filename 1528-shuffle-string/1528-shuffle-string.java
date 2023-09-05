class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder();        
        int n = indices.length;
        char afterShuffling[] = new char[n];
        
        for(int i=0; i<n; i++){
            int index = indices[i];            
            afterShuffling[index] = s.charAt(i);            
        }
        str.append(afterShuffling);
      
        return str.toString();
    }
}