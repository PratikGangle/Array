class NumArray {             
    int num[];
    public NumArray(int[] nums) {               
        int n = nums.length;
        num= new int[n];        
        for(int i=0; i<n; i++){
            num[i] = nums[i];
        }        
    }
    
    public int sumRange(int left, int right) {        
        int sum = 0;        
        for(int i=left ; i<=right; i++){
            sum += num[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */