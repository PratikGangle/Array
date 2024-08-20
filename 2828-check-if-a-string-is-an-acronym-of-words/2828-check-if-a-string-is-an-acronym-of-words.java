class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        if(words.size() != s.length()){
            return false;
        }
        
        for(int i=0; i<words.size(); i++){
            char c = words.get(i).charAt(0);
            if(s.charAt(i) != c){
                return false;
            }
        }
        return true;
    }
}