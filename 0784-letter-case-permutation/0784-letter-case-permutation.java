class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> res = new ArrayList<>();
        solve("", s , res);
        
        return res;
    }
    
    
    void solve(String op, String in , List<String> res){
        
        if( in.length() == 0){
            res.add(op);
            return;
        }
        
        String ch = "" + in.charAt(0);
        if(isAlphabet(in.charAt(0))){
            String op1 = op + ch.toLowerCase();
            solve(op1,in.substring(1),res);
            
            String op2 = op + ch.toUpperCase();
            solve(op2,in.substring(1),res);
            
        }
        else{
            solve(op + in.charAt(0),in.substring(1),res);            
        }
    }
     
    public boolean isAlphabet(char c){    

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
           return true;
        else
           return false;
    }    
}