class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();        
        for(int i=0; i<candyType.length; i++){
            set.add(candyType[i]);
        }        
        int n = candyType.length /2 ;        
        if(set.size() > n) return n;
        
        return set.size();
    }
}