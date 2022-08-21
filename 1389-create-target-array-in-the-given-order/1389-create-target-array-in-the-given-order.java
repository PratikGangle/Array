
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] output = new int[index.length];

        for (int i = 0; i < nums.length; i++) {

            for (int j = output.length - 1; j > index[i]; j--) {

                output[j] = output[j - 1];
            }
            output[index[i]] = nums[i];

        }

        return output;

    }

}