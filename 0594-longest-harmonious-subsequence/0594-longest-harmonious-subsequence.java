class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int key : map.keySet() ){
            if(map.containsKey(key + 1)){
                ans = Math.max(ans , map.get(key) + map.get(key+1));
            }
        }
        return ans;
    }
}