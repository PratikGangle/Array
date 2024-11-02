class Solution {
    public String makeFancyString(String s) {               
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        int freq = 1;
        
        for(int i=1; i<s.length(); i++){
            if(result.charAt(result.length()-1) == s.charAt(i)){
                freq++;
                if(freq < 3){
                    result.append(s.charAt(i));
                }
            }
            else{                                   
                result.append(s.charAt(i));
                freq = 1;
            }            
        }
        return result.toString();
    }
}