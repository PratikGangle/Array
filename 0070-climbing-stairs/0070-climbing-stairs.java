class Solution {
    
   
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        
        // fill the array 
        Arrays.fill(arr,-1);
        
        arr[0] =1;
        //tabulation loop
        for(int i=1; i<=n; i++){
            if(i==1){
                arr[i] = arr[i-1];
            }
            else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
       // return the answer
        return arr[n];
    }
}