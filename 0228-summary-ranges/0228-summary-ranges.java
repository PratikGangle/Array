class Solution {
    public List<String> summaryRanges(int[] nums) {                
        List<String> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0] + "");
            return list;
        }         
        for(int i=0; i<nums.length;){            
            int start = i , end = i;
            while(end < nums.length-1 && nums[end+1] == nums[end] +1 ) end++;            
            if(start < end) list.add(nums[start] + "->" + nums[end]);
            else list.add(nums[start] + "");            
            i = end + 1;
        }                 
        return list;
    }
}