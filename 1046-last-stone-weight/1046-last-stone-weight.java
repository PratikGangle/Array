class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);        
        for(int i=0; i<stones.length; i++){
            pq.add(stones[i]);
        }        
        while(pq.size() != 1){
            pq.add(pq.poll() - pq.poll() );
        }            
         
        return pq.poll();
    }
}