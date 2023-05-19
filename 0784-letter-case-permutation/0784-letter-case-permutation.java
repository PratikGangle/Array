class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> res = new ArrayList<>();
        solve("", s , 0 , res);
        
        return res;
    }
    
    
    void solve(String op, String in ,int n , List<String> res){
        
        if( in.length() == n){
            res.add(op);
            return;
        }
        
        String ch = "" + in.charAt(n);
        if(isAlphabet(in.charAt(n))){
            String op1 = op + ch.toLowerCase();
            solve(op1, in ,n+1 ,res);
            
            String op2 = op + ch.toUpperCase();
            solve(op2, in  , n+1 , res);
            
        }
        else{
            solve(op + in.charAt(n), in, n+1 ,res);            
        }
    }
     
    public boolean isAlphabet(char c){    

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
           return true;
        else
           return false;
    }    
}