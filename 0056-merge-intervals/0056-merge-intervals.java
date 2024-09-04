class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
        
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
        
        List<int[]> list = new ArrayList<>();
        
        int prevInterval[] = intervals[0];
        
        for(int i=1; i<intervals.length; i++){
            int currFirst = intervals[i][0];
            int currSecond = intervals[i][1];            
            int prevFirst = prevInterval[0];
            int prevSecond = prevInterval[1];
            
            if(prevSecond < currFirst){
                list.add(prevInterval);
                prevInterval = intervals[i];                
            }            
            else{
                prevInterval[1] = Math.max(prevSecond,currSecond);
            }            
        }   
        list.add(prevInterval);
        return list.toArray(new int[list.size()][]);        
    }
}