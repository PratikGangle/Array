class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int out[] = new int[nums1.length];
        
        for(int i=0; i<out.length ; i++){
            out[i] =-1;
        }
        
        for(int i=0; i<nums1.length; i++){
            int ele = nums1[i];
            int index=0;
            for(int j=0; j<nums2.length; j++){
                if(ele == nums2[j]){
                    index = j;
                    break;
                }
            }
            System.out.print(index);
            for(int j=index; j<nums2.length; j++){
                if(nums1[i] < nums2[j]){
                    out[i] = nums2[j];
                    break;
                }
            }
        }
        
        return out;
    }
}