class Solution {
    public int mostFrequentEven(int[] nums) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
       
        for(int i=0; i<nums.length; i++){
           
            if(nums[i] %2 == 0){
                 if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);                
            }
               else{
                   map.put(nums[i],1);
               }                                    
            }                      
        }
                    
        Set<Integer> keySet = map.keySet();
            
        int ans=-1;
        int freq =-1;
        for(Integer key : keySet){
            if(map.get(key)> freq){
                freq=map.get(key);
                ans=key;
            }
        }
                    return ans;
    }
}