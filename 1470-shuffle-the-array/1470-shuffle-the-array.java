class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        // create new array
      
        int arr2[] = new int[n];
        int arr3[] = new int[n];
        
        int ans[] = new int[nums.length];


        for (int i = 0; i < n; i++) {

            arr2[i] = nums[i];
            
        }
        for (int i = 0; i < n; i++) {

            arr3[i] = nums[i+n];
            
        }

    int k=0;
        for (int i = 0; i < n; i++) {

           ans[k++]=arr2[i];
            ans[k++]=arr3[i];


    }
     
        return ans;
    }
        
}

        
    