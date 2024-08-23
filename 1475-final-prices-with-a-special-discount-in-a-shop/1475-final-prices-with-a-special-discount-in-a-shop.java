class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int answer[] = new int[n];
        
        for(int i=0; i<n-1; i++){
            boolean flag = true;
            for(int j =i+1; j<n; j++){
                if(prices[i] >= prices[j]){
                    answer[i] = prices[i] - prices[j];
                    flag = false;
                    break;
                }
            }            
            if(flag){
                answer[i] = prices[i];
            }
        }
        answer[n-1] = prices[n-1];
        return answer;
    }
}