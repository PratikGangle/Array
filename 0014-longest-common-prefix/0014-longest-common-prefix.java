class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            
            char c = strs[0].charAt(i);
            boolean check = false;
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || c != strs[j].charAt(i)){
                    check = true;
                }                 
            }
            if(check){
                break;
            }
            result.append(c);            
        }
        
        return result.toString();        
    }
}