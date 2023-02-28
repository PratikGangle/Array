class Solution {
    public boolean isPalindrome(String s) {
        
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if('a'<=ch && 'z'>=ch){
                 list.add(ch);
            }
            else if('A'<=ch && 'Z'>=ch){
                int c = ch-'A';
                ch = (char)('a' + c);
                list.add(ch);
            }             
            if(ch >='0' && ch<='9'){
                list.add(ch);
            }
        }
        int i=0;
        int j =list.size()-1;
        while(i < j){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}