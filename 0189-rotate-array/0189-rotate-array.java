class Solution {
    public void rotate(int[] nums, int k) {
        
        int rotate = (k % nums.length);
        
        if(nums.length == 1){
            return;
        }
        if(rotate==0){
            return;
        }
        
        ArrayList<Integer> list = new ArrayList<>();        
        
        int length = nums.length;
        
        int i = length - rotate;
       
        while(i < length){
            list.add(nums[i]);
            i++;
        }
        
        i =0;
        int j = length -rotate;
        
        while(i < j ){
            list.add(nums[i]);
            i++;
        }
                
        for(int val=0; val<list.size(); val++){
            nums[val] = list.get(val);
        }
        
        
    }
}