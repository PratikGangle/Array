class Solution {
    public boolean makeEqual(String[] words) {         
        int map[] = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                map[c - 'a']++;
            }
        }
        int numStrings = words.length;
        for (int count : map) {
            if (count % numStrings != 0) {
                return false;
            }
        }
        return true;
    }
}