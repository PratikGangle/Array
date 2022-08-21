class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int size = candies.length;
        List<Boolean> list=new ArrayList<Boolean>(candies.length);
        
         // Initialize maximum element 
        
        int max=0;
        
        // find the maximum element in the array
        
        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        
    

     for (int i = 0; i < candies.length; i++) {
        if(candies[i]+extraCandies < max){
            list.add(false);
        }
        else{
            list.add(true);
        }
    }
        
        return list;
        
    }
}