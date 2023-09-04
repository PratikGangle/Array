class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlength = 0;        
        for(String i : sentences){
            int length = i.split(" ").length;
            if(maxlength < length){
                maxlength = length;
            }
        }
        return maxlength;
    }
}