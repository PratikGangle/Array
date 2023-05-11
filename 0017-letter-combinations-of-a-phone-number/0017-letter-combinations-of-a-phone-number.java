class Solution {
    
    public List<String> letterCombinations(String digits) {
        
        Map<Integer , String > map = new HashMap<>();
        
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
                
         List<String> list = new ArrayList<>();
        
        // if digits string  is empty return empty list
        if(digits.equals("")){
            return list;
        }
         helper(digits, "", map , list);

        return list;
    }
    
    
    public void helper(String in, String op, Map<Integer,String> map , List<String> list ) {

        if (in.isEmpty()) {
            list.add(op);
            return;
        }

        int digit = in.charAt(0) - '0'; // this convert '2' to 2
        String str = map.get(digit);  

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            helper(in.substring(1), op + ch , map , list);
        }

    }
}