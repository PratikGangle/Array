class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        int num = x;
        int ans =0;
        while(num > 0){
            int digit =num%10;
            ans = ans *10 + digit;
            num = num/10;
        }
        
        if(ans==x){
            return true;
        }
        else{
            return false;
        }
        
    }
}