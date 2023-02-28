class Solution {
    public boolean isPalindrome(String s) {       
       
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if('a'<=ch && 'z'>=ch || ch >='0' && ch<='9' ){
                 str.append(ch);
            }
            else if('A'<=ch && 'Z'>=ch){
                int c = ch-'A';
                ch = (char)('a' + c);
                 str.append(ch);
            }             
           
        }
        int i=0;
        int j =str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}