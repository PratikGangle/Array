class Solution {
    public int compress(char[] chars) {
        
        if (chars.length == 1) {
            return 1;
        }

        int count = 1;
        StringBuilder str = new StringBuilder();
        str.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {

            char curr = chars[i];
            char prev = chars[i - 1];

            if (prev == curr) {
                count++;
            } else {
                if (count > 1) {
                    str.append(count);
                }
                str.append(curr);
                count = 1;
            }
        }
        if(count>1){
             str.append(count);            
        }
       
        int ans = str.length();

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        
        return ans;

         
    }
}