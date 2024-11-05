class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        char ch = word.charAt(0);
        int count = 1;
        for(int i=1; i<word.length(); i++){
            char c = word.charAt(i);
            if(count < 9 && c == ch){
                count++;
            }
            else{
                result.append(count);
                result.append(ch);
                ch = c;
                count = 1;
            }
        }
        result.append(count);
        result.append(ch);
        return result.toString();
    }
}