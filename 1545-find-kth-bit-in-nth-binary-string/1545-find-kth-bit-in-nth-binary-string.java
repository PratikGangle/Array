class Solution {
    
    
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
      
        // find the n th string lenth
        int len = (int) Math.pow(2,n)-1;

        // if k is mid value of the string
        if (k == len / 2 + 1) {            
            return '1';        
        } 
        
        // if k value is greater than the mid value so return reverse value
        else if (k > len / 2 + 1) {
            return findKthBit(n - 1, len - k + 1) == '0' ? '1':'0';
        }  
        
        // if k value is smaller than the mid value so simply n--
        else{
            return findKthBit(n - 1, k);
        }
    }
}