class Solution {
    public int buyChoco(int[] prices, int money) {
        int minPrice = Integer.MAX_VALUE;
        int seMinPrice = Integer.MAX_VALUE;
        
        for(int price : prices){
            if(price < minPrice){
                seMinPrice = minPrice;
                minPrice = price;
            }
            else{
                seMinPrice = Math.min(seMinPrice, price);
            }        
        }
        
        if((seMinPrice + minPrice) > money){             
            return money;         
        }                
        return money - (seMinPrice + minPrice);
    }
}