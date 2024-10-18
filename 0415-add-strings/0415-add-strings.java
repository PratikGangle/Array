class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder result = new StringBuilder();   
        
        int carry = 0;
        int n = num1.length()-1;
        int m = num2.length()-1;
        while(n >=0 || m >=0){
            int s=0, s1=0, s2 = 0;    
            if( n >= 0){                
                s1 = num1.charAt(n--)- '0';
            }
             if( m >= 0){
                 s2 = num2.charAt(m--) - '0';                
            }            
            s = s1 + s2 + carry;
            
            if(s >= 10){                
                s = s- 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            result.append(s);
        }
        if(carry == 1){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}