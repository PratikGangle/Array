class Solution {
    public int thirdMax(int[] nums) {
       
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        int [] arr = new int[set.size()];
        
        int j=0;
       for(Integer i : set){
           arr[j++]  =i;
       }
        
      
        
        if(arr.length <=2){
            return arr[arr.length-1];
        }
        
        
        return arr[arr.length -3];
      
    }
}