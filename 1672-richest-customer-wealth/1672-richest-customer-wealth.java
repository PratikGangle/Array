class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int wealth=0;
        
        // create a new array
       
        int arr[] = new int[accounts.length];
        
      
        for (int i = 0; i < accounts.length; i++) {
            wealth =0;

            for (int j = 0; j < accounts[i].length; j++) {

                wealth = wealth + accounts[i][j];
                
            }
            arr[i]=wealth;
        }
                
        int max_wealth =0;

        for (int i = 0; i < arr.length; i++) {
            if(max_wealth<arr[i])
            {
                max_wealth = arr[i];
            }
        }
        
        return max_wealth;
    }
}