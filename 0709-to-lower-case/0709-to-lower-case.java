class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch >='A' && ch <= 'Z'){

                ch =(char) (ch + 32) ;
                str.append(ch);
            }
            else{
                 str.append(ch);
            }
         
        }
        
        s = str + "";
        
        return s;
    }
}