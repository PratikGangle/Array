
class Solution {
    public int maxProfit(int[] prices) {
          int profit = 0;
          int temp = 0;

        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (buy > prices[i]) {
                buy = prices[i];
            }

            if (buy < prices[i]) {
                temp = prices[i] - buy;
            }
            if (temp > profit) {
                profit = temp;
            }
        }

        return profit;
    }   
         
    }
