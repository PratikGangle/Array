class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> list = new ArrayList<>();
        for(String word : words){
            int rows[] = new int[3];          
            for(char c : word.toLowerCase().toCharArray()){               
                if(row1.indexOf(c) != -1){
                    rows[0] = 1;
                }
                else if(row2.indexOf(c) != -1){
                    rows[1] = 1;                    
                }
                else if (row3.indexOf(c) != -1){
                    rows[2]  = 1;
                }                
            }
          
            if(rows[0] + rows[1] + rows[2] == 1){
                list.add(word);
            }            
        }
        String arr[] = new String[list.size()];
        int i = 0;
        for(String s : list){
            arr[i++] = s;
        }
        return arr;    
    }
}