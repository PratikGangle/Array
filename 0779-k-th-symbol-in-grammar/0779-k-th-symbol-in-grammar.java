class Solution {
    public int kthGrammar(int n, int k) {
        
        if(n==1 && k==1){
            return 0;
        }
        
        int mid =(int) (Math.pow(2,n-1)/2);
        
        // if k th number present in the half
        if(k <= mid){
            return kthGrammar(n-1,k);
        }
        
        // if k th number not present in the half
        else{
            return 1^kthGrammar(n-1,k-mid);
        }
       
    }
    
    
    // 0            row 1
    // 01           row 2
    // 01  10       row3
    // 0110 1001   1001 is complement of previous row and 0110 is same like previous row
}