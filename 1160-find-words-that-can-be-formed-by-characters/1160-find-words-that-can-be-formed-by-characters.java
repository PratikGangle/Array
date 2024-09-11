class Solution {
    public int countCharacters(String[] words, String chars) {
        int charCount[] = new int[26];
        int count = 0;
        for(int i=0; i<chars.length(); i++){
            int ind  = chars.charAt(i) - 'a';
            charCount[ind]++;
        }
        
        for(String s : words){
            int wordCount[] = new int[26];
            for(int i=0; i<s.length(); i++){                 
                int ind  = s.charAt(i) - 'a';                
                wordCount[ind]++;                
            }
            boolean ok = true;
            for(int i=0; i<26; i++){
                if(wordCount[i] > charCount[i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                count += s.length();
            }
        }
        return count;
    }
}