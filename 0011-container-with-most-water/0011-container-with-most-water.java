class Solution {
    public int maxArea(int[] height) {
        
         int i = 0;
        int j = height.length - 1;
        int max = 0;
        // max variable store the maximum amount of water
        while (i <= j) {
            int min = 0; 
            //find the minimum height of the veritcal line

            if (height[i] < height[j]) {
                min = height[i];
            } else {
                min = height[j];
            }
            min = min * (j - i);

            if (min > max) {
                max = min;
            }

            if (height[i] < height[j]) {
                i++;
            } else if (height[j] <= height[i]) {
                j--;
            }
        }        
        return max;       
        
    }
}