class Solution {
    public int thirdMax(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length ==2){
            return Math.max(nums[0], nums[1]);
        }
        
        long m1 = Long.MIN_VALUE;
        long m2 =Long.MIN_VALUE;
        long m3 =Long.MIN_VALUE;
        
        // System.out.print(m3);
            
        
        for(int i : nums){
            
            if(i == m1 || i== m2  || i == m3){
                continue;
            }
            
            if(i >= m1){
                m3 = m2;
                m2 =m1;
                m1 =i;
            }
            
            else if(i>=m2){
                m3=m2;
                m2 =i;
            }
            
            else if( i>=m3){
                m3 =i;
            }
            
            
        }
        
        if(m3 == Long.MIN_VALUE){
            return  (int) m1;
        }
        
        return  (int) m3;
       
    }
}