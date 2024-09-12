class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.charAt(0);
        int c =  (s.charAt(0) ^ t.charAt(0));
        for(int i=1; i<s.length(); i++){
            c = c ^ s.charAt(i) ^ t.charAt(i);            
        }
        c = c ^ t.charAt(t.length()-1);
        return (char)c;
    }
}