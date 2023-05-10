class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();
      
          helper(n , n , "" , list);
        
        return list;
    }
    
    
    public void helper(int o , int c , String str , List<String> list){  // open and close
        
        if(o == 0 && c == 0){
            list.add(str);
            return;
        }
        
        if(o == 0){
               helper(o, c-1, str + ")" , list);
        }
        else if( c == o){
             helper(o-1, c, str + "(" , list);            
        }
        else {
            
              helper(o, c-1, str + ")" , list);
             helper(o-1, c, str + "(" , list); 
        }       
      
    }
}