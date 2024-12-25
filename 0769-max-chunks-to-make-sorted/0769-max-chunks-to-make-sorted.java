class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int sortArraySum = 0;
        int arrSum = 0;
        for(int i=0; i<arr.length; i++){
            arrSum += arr[i];
            sortArraySum += i;            
            if(arrSum == sortArraySum){
                chunks++;
            }
        }        
        return chunks;        
    }
}