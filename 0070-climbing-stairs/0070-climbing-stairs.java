class Solution {
    
   
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        
        // fill the array 
        Arrays.fill(arr,-1);
        
        // use helper function to pass array
            helper(n, arr);
        
       // return the answer
        return arr[n];
    }
    
    public int helper(int n, int arr[]){
         if(n==0){
            return 1;
        }
        if( n< 0){
            return 0;
        }
        
        if(arr[n] != -1){
            return arr[n];
        }
        
        arr[n] = helper(n-1,arr) + helper(n-2,arr);      
        return arr[n];
    }
}