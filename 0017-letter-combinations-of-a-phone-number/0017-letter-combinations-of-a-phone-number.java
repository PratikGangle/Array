class Solution {
    
    public List<String> letterCombinations(String digits) {
        
         
        String[] arr = new String[10];
        arr[0] = "";
        arr[1] = "";
        arr[2] = "abc";
        arr[3] = "def";
        arr[4] = "ghi";
        arr[5] = "jkl";
        arr[6] = "mno";
        arr[7] = "pqrs";
        arr[8] = "tuv";
        arr[9] = "wxyz";
                        
         List<String> list = new ArrayList<>();
        
        // if digits string  is empty return empty list
        if(digits.equals("")){
            return list;
        }
         helper(digits, "", arr , list);

        return list;
    }
    
    
   public void helper(String in, String op, String[] arr, List<String> list) {

        if (in.isEmpty()) {
            list.add(op);
            return;
        }

        int digit = in.charAt(0) - '0'; // this convert '2' to 2
        String str = arr[digit];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            helper(in.substring(1), op + ch, arr, list);
        }

    }
}