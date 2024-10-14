class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long result = 0;
        for(int num : nums){
            pq.add(num);
        }
        
        while(k > 0){
            int num = pq.poll();
            result += num;
            pq.add((int)Math.ceil(num/3.0));
            k--;
        }
        return result;
    }
}